/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import java.util.Objects;

/**
 * A tuple of 25 elements which can be seen as cartesian product of 25 components.
 *
 * @param <T1> type of the 1st element
 * @param <T2> type of the 2nd element
 * @param <T3> type of the 3rd element
 * @param <T4> type of the 4th element
 * @param <T5> type of the 5th element
 * @param <T6> type of the 6th element
 * @param <T7> type of the 7th element
 * @param <T8> type of the 8th element
 * @param <T9> type of the 9th element
 * @param <T10> type of the 10th element
 * @param <T11> type of the 11th element
 * @param <T12> type of the 12th element
 * @param <T13> type of the 13th element
 * @param <T14> type of the 14th element
 * @param <T15> type of the 15th element
 * @param <T16> type of the 16th element
 * @param <T17> type of the 17th element
 * @param <T18> type of the 18th element
 * @param <T19> type of the 19th element
 * @param <T20> type of the 20th element
 * @param <T21> type of the 1st element
 * @param <T22> type of the 2nd element
 * @param <T23> type of the 3rd element
 * @param <T24> type of the 24th element
 * @param <T25> type of the 25th element
 * @since 1.1.0
 */
public final class Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> implements Tuple {

    private static final long serialVersionUID = 1L;

    /**
     * The 1st element of this tuple.
     */
    public final T1 _1;

    /**
     * The 2nd element of this tuple.
     */
    public final T2 _2;

    /**
     * The 3rd element of this tuple.
     */
    public final T3 _3;

    /**
     * The 4th element of this tuple.
     */
    public final T4 _4;

    /**
     * The 5th element of this tuple.
     */
    public final T5 _5;

    /**
     * The 6th element of this tuple.
     */
    public final T6 _6;

    /**
     * The 7th element of this tuple.
     */
    public final T7 _7;

    /**
     * The 8th element of this tuple.
     */
    public final T8 _8;

    /**
     * The 9th element of this tuple.
     */
    public final T9 _9;

    /**
     * The 10th element of this tuple.
     */
    public final T10 _10;

    /**
     * The 11th element of this tuple.
     */
    public final T11 _11;

    /**
     * The 12th element of this tuple.
     */
    public final T12 _12;

    /**
     * The 13th element of this tuple.
     */
    public final T13 _13;

    /**
     * The 14th element of this tuple.
     */
    public final T14 _14;

    /**
     * The 15th element of this tuple.
     */
    public final T15 _15;

    /**
     * The 16th element of this tuple.
     */
    public final T16 _16;

    /**
     * The 17th element of this tuple.
     */
    public final T17 _17;

    /**
     * The 18th element of this tuple.
     */
    public final T18 _18;

    /**
     * The 19th element of this tuple.
     */
    public final T19 _19;

    /**
     * The 20th element of this tuple.
     */
    public final T20 _20;

    /**
     * The 1st element of this tuple.
     */
    public final T21 _21;

    /**
     * The 2nd element of this tuple.
     */
    public final T22 _22;

    /**
     * The 3rd element of this tuple.
     */
    public final T23 _23;

    /**
     * The 24th element of this tuple.
     */
    public final T24 _24;

    /**
     * The 25th element of this tuple.
     */
    public final T25 _25;

    /**
     * Constructs a tuple of 25 elements.
     *
     * @param t1 the 1st element
     * @param t2 the 2nd element
     * @param t3 the 3rd element
     * @param t4 the 4th element
     * @param t5 the 5th element
     * @param t6 the 6th element
     * @param t7 the 7th element
     * @param t8 the 8th element
     * @param t9 the 9th element
     * @param t10 the 10th element
     * @param t11 the 11th element
     * @param t12 the 12th element
     * @param t13 the 13th element
     * @param t14 the 14th element
     * @param t15 the 15th element
     * @param t16 the 16th element
     * @param t17 the 17th element
     * @param t18 the 18th element
     * @param t19 the 19th element
     * @param t20 the 20th element
     * @param t21 the 1st element
     * @param t22 the 2nd element
     * @param t23 the 3rd element
     * @param t24 the 24th element
     * @param t25 the 25th element
     */
    public Tuple25(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19, T20 t20, T21 t21, T22 t22, T23 t23, T24 t24, T25 t25) {
        this._1 = t1;
        this._2 = t2;
        this._3 = t3;
        this._4 = t4;
        this._5 = t5;
        this._6 = t6;
        this._7 = t7;
        this._8 = t8;
        this._9 = t9;
        this._10 = t10;
        this._11 = t11;
        this._12 = t12;
        this._13 = t13;
        this._14 = t14;
        this._15 = t15;
        this._16 = t16;
        this._17 = t17;
        this._18 = t18;
        this._19 = t19;
        this._20 = t20;
        this._21 = t21;
        this._22 = t22;
        this._23 = t23;
        this._24 = t24;
        this._25 = t25;
    }

    @Override
    public int arity() {
        return 25;
    }

    public <U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, U13, U14, U15, U16, U17, U18, U19, U20, U21, U22, U23, U24, U25> Tuple25<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, U13, U14, U15, U16, U17, U18, U19, U20, U21, U22, U23, U24, U25> map(Function25<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? super T23, ? super T24, ? super T25, Tuple25<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, U13, U14, U15, U16, U17, U18, U19, U20, U21, U22, U23, U24, U25>> f) {
        return f.apply(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25);
    }

    public <U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, U13, U14, U15, U16, U17, U18, U19, U20, U21, U22, U23, U24, U25> Tuple25<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, U13, U14, U15, U16, U17, U18, U19, U20, U21, U22, U23, U24, U25> map(Function1<? super T1, ? extends U1> f1, Function1<? super T2, ? extends U2> f2, Function1<? super T3, ? extends U3> f3, Function1<? super T4, ? extends U4> f4, Function1<? super T5, ? extends U5> f5, Function1<? super T6, ? extends U6> f6, Function1<? super T7, ? extends U7> f7, Function1<? super T8, ? extends U8> f8, Function1<? super T9, ? extends U9> f9, Function1<? super T10, ? extends U10> f10, Function1<? super T11, ? extends U11> f11, Function1<? super T12, ? extends U12> f12, Function1<? super T13, ? extends U13> f13, Function1<? super T14, ? extends U14> f14, Function1<? super T15, ? extends U15> f15, Function1<? super T16, ? extends U16> f16, Function1<? super T17, ? extends U17> f17, Function1<? super T18, ? extends U18> f18, Function1<? super T19, ? extends U19> f19, Function1<? super T20, ? extends U20> f20, Function1<? super T21, ? extends U21> f21, Function1<? super T22, ? extends U22> f22, Function1<? super T23, ? extends U23> f23, Function1<? super T24, ? extends U24> f24, Function1<? super T25, ? extends U25> f25) {
        return map((t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25) -> Tuple.of(f1.apply(t1), f2.apply(t2), f3.apply(t3), f4.apply(t4), f5.apply(t5), f6.apply(t6), f7.apply(t7), f8.apply(t8), f9.apply(t9), f10.apply(t10), f11.apply(t11), f12.apply(t12), f13.apply(t13), f14.apply(t14), f15.apply(t15), f16.apply(t16), f17.apply(t17), f18.apply(t18), f19.apply(t19), f20.apply(t20), f21.apply(t21), f22.apply(t22), f23.apply(t23), f24.apply(t24), f25.apply(t25)));
    }

    @Override
    public Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> unapply() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Tuple25)) {
            return false;
        } else {
            final Tuple25<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (Tuple25<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(this._1, that._1)
                    && Objects.equals(this._2, that._2)
                    && Objects.equals(this._3, that._3)
                    && Objects.equals(this._4, that._4)
                    && Objects.equals(this._5, that._5)
                    && Objects.equals(this._6, that._6)
                    && Objects.equals(this._7, that._7)
                    && Objects.equals(this._8, that._8)
                    && Objects.equals(this._9, that._9)
                    && Objects.equals(this._10, that._10)
                    && Objects.equals(this._11, that._11)
                    && Objects.equals(this._12, that._12)
                    && Objects.equals(this._13, that._13)
                    && Objects.equals(this._14, that._14)
                    && Objects.equals(this._15, that._15)
                    && Objects.equals(this._16, that._16)
                    && Objects.equals(this._17, that._17)
                    && Objects.equals(this._18, that._18)
                    && Objects.equals(this._19, that._19)
                    && Objects.equals(this._20, that._20)
                    && Objects.equals(this._21, that._21)
                    && Objects.equals(this._22, that._22)
                    && Objects.equals(this._23, that._23)
                    && Objects.equals(this._24, that._24)
                    && Objects.equals(this._25, that._25);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25);
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25);
    }
}