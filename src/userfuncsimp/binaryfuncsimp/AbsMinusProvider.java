// This is a provider for the AbsMinus function.

package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;

public class AbsMinusProvider implements BinFuncProvider {

    // Provider and AbsPlus object.
    public BinaryFunc get() {
        return new AbsMinus();
    }
}