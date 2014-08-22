package io.vec.demo.android.ipc;

import android.os.MemoryFile;

public class IPC {
	public static native int setMemoryFile(MemoryFile mfs);
    public static native int setFd(int fd);

	static {
		System.loadLibrary("ipc_shared");
	}
}