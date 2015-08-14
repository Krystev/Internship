package com.vratsasoftware.tweenaccessors;

import aurelienribon.tweenengine.TweenAccessor;

public class ValueAccessor implements TweenAccessor<Value>{

	@Override
	public int getValues(Value target, int tweenType, float[] returnValue) {
		returnValue[0] = target.getValue();
		return 1;
	}

	@Override
	public void setValues(Value target, int tweenType, float[] newValue) {
		target.setValue(newValue[0]);
	}

}
