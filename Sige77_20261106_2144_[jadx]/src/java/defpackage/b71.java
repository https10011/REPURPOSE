package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b71 extends gu0 {
    public static Long t(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.gu0, defpackage.hb0
    public final void b(jb1 jb1Var, jb1 jb1Var2) throws IOException {
        jb1Var.getClass();
        jb1Var2.getClass();
        try {
            Path path = Paths.get(jb1Var.a.r(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(jb1Var2.a.r(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            uq1.o("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.gu0, defpackage.hb0
    public final x00 n(jb1 jb1Var) {
        jb1 jb1VarH;
        jb1Var.getClass();
        Path path = Paths.get(jb1Var.a.r(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = jb1.b;
                jb1VarH = br0.h(symbolicLink.toString());
            } else {
                jb1VarH = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lT = fileTimeCreationTime != null ? t(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lT2 = fileTimeLastModifiedTime != null ? t(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new x00(zIsRegularFile, zIsDirectory, jb1VarH, lValueOf, lT, lT2, fileTimeLastAccessTime != null ? t(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.gu0
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
