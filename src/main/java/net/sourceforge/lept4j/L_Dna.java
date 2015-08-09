package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.DoubleByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : array.h:35</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Dna extends Structure {
	/**
	 * size of allocated number array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * number of numbers saved<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_int32
	 */
	public int refcount;
	/**
	 * x value assigned to array[0]<br>
	 * C type : l_float64
	 */
	public double startx;
	/**
	 * change in x value as i --&gt; i + 1<br>
	 * C type : l_float64
	 */
	public double delx;
	/**
	 * number array<br>
	 * C type : l_float64*
	 */
	public DoubleByReference array;
	public L_Dna() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nalloc", "n", "refcount", "startx", "delx", "array");
	}
	/**
	 * @param nalloc size of allocated number array<br>
	 * C type : l_int32<br>
	 * @param n number of numbers saved<br>
	 * C type : l_int32<br>
	 * @param refcount reference count (1 if no clones)<br>
	 * C type : l_int32<br>
	 * @param startx x value assigned to array[0]<br>
	 * C type : l_float64<br>
	 * @param delx change in x value as i --&gt; i + 1<br>
	 * C type : l_float64<br>
	 * @param array number array<br>
	 * C type : l_float64*
	 */
	public L_Dna(int nalloc, int n, int refcount, double startx, double delx, DoubleByReference array) {
		super();
		this.nalloc = nalloc;
		this.n = n;
		this.refcount = refcount;
		this.startx = startx;
		this.delx = delx;
		this.array = array;
	}
	public L_Dna(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends L_Dna implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Dna implements Structure.ByValue {
		
	};
}
