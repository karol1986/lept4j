package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * bbuffer.h<br>
 *      Expandable byte buffer for reading data in from memory and<br>
 *      writing data out to other memory.<br>
 *      This implements a queue of bytes, so data read in is put<br>
 *      on the "back" of the queue (i.e., the end of the byte array)<br>
 *      and data written out is taken from the "front" of the queue<br>
 *      (i.e., from an index marker "nwritten" that is initially set at<br>
 *      the beginning of the array.)  As usual with expandable<br>
 *      arrays, we keep the size of the allocated array and the<br>
 *      number of bytes that have been read into the array.<br>
 *      For implementation details, see bbuffer.c.<br>
 * <i>native declaration : bbuffer.h:18</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ByteBuffer extends Structure {
	/**
	 * size of allocated byte array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * number of bytes read into to the array<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * number of bytes written from the array<br>
	 * C type : l_int32
	 */
	public int nwritten;
	/**
	 * byte array<br>
	 * C type : l_uint8*
	 */
	public Pointer array;
	public ByteBuffer() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nalloc", "n", "nwritten", "array");
	}
	/**
	 * @param nalloc size of allocated byte array<br>
	 * C type : l_int32<br>
	 * @param n number of bytes read into to the array<br>
	 * C type : l_int32<br>
	 * @param nwritten number of bytes written from the array<br>
	 * C type : l_int32<br>
	 * @param array byte array<br>
	 * C type : l_uint8*
	 */
	public ByteBuffer(int nalloc, int n, int nwritten, Pointer array) {
		super();
		this.nalloc = nalloc;
		this.n = n;
		this.nwritten = nwritten;
		this.array = array;
	}
	public ByteBuffer(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends ByteBuffer implements Structure.ByReference {
		
	};
	public static class ByValue extends ByteBuffer implements Structure.ByValue {
		
	};
}
