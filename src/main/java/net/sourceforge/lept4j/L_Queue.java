package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * queue.h<br>
 *      Expandable pointer queue for arbitrary void* data.<br>
 *      The L_Queue is a fifo that implements a queue of void* pointers.<br>
 *      It can be used to hold a queue of any type of struct.<br>
 *      Internally, it maintains two counters:<br>
 *          nhead:  location of head (in ptrs) from the beginning<br>
 *                  of the array.<br>
 *          nelem:  number of ptr elements stored in the queue.<br>
 *      The element at the head of the queue, which is the next to<br>
 *      be removed, is array[nhead].  The location at the tail of the<br>
 *      queue to which the next element will be added is<br>
 *      array[nhead + nelem].<br>
 *               <br>
 *      As items are added to the queue, nelem increases.<br>
 *      As items are removed, nhead increases and nelem decreases.<br>
 *      Any time the tail reaches the end of the allocated array,<br>
 *      all the pointers are shifted to the left, so that the head<br>
 *      is at the beginning of the array.<br>
 *      If the array becomes more than 3/4 full, it doubles in size.<br>
 *      The auxiliary stack can be used in a wrapper for re-using<br>
 *      items popped from the queue.  It is not made by default.<br>
 *      For further implementation details, see queue.c.<br>
 * <i>native declaration : queue.h:30</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Queue extends Structure {
	/**
	 * size of allocated ptr array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * location of head (in ptrs) from the<br>
	 * C type : l_int32
	 */
	public int nhead;
	/**
	 * number of elements stored in the queue<br>
	 * C type : l_int32
	 */
	public int nelem;
	/**
	 * ptr array<br>
	 * C type : void**
	 */
	public PointerByReference array;
	/**
	 * auxiliary stack<br>
	 * C type : L_Stack*
	 */
	public net.sourceforge.lept4j.L_Stack.ByReference stack;
	public L_Queue() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nalloc", "nhead", "nelem", "array", "stack");
	}
	/**
	 * @param nalloc size of allocated ptr array<br>
	 * C type : l_int32<br>
	 * @param nhead location of head (in ptrs) from the<br>
	 * C type : l_int32<br>
	 * @param nelem number of elements stored in the queue<br>
	 * C type : l_int32<br>
	 * @param array ptr array<br>
	 * C type : void**<br>
	 * @param stack auxiliary stack<br>
	 * C type : L_Stack*
	 */
	public L_Queue(int nalloc, int nhead, int nelem, PointerByReference array, net.sourceforge.lept4j.L_Stack.ByReference stack) {
		super();
		this.nalloc = nalloc;
		this.nhead = nhead;
		this.nelem = nelem;
		this.array = array;
		this.stack = stack;
	}
	public L_Queue(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_Queue implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Queue implements Structure.ByValue {
		
	};
}
