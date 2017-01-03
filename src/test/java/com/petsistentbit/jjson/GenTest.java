package com.petsistentbit.jjson;

import com.persistentbit.core.tuples.Tuple2;

/**
 * @author Peter Muys
 * @since 31/08/2016
 */
@SuppressWarnings("FieldCanBeLocal")
class GenTest<A,B> {
    private final Tuple2<A,String> tupleAString;
    private final Tuple2<B,Integer> tupleBInteger;
    private final Tuple2<Float,Double> tupleFloatDouble;

    public GenTest() {
        this(null,null,null);
    }

    public GenTest(Tuple2<A, String> tupleAString, Tuple2<B, Integer> tupleBInteger,Tuple2<Float,Double> tupleFloatDouble) {
        this.tupleAString = tupleAString;
        this.tupleBInteger = tupleBInteger;
        this.tupleFloatDouble = tupleFloatDouble;
    }
}
