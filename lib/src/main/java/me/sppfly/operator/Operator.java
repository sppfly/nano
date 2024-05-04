package me.sppfly.operator;

import me.sppfly.operator.base.Operator1In;
import me.sppfly.operator.base.Operator1Out;

public interface Operator<IN, OUT> extends Operator1In<IN>, Operator1Out<OUT> {

}
