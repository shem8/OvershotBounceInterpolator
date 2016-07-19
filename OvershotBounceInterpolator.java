package com.shem.android.interpolator;

import android.animation.TimeInterpolator;

public class OvershotBounceInterpolator implements TimeInterpolator {

	@Override
	public float getInterpolation(float t) {
		//Using this graph: http://fooplot.com/#W3sidHlwZSI6MCwiZXEiOiIxKyg0KSooMi4yKngtMSleMyszKigyLjMqeC0xKV4yIiwiY29sb3IiOiIjRjIwOTA5In0seyJ0eXBlIjowLCJlcSI6IjErMC4yKnNpbigyMit4KjQqcGkqMikvZXhwKDIqeCkiLCJjb2xvciI6IiMwMDAwMDAifSx7InR5cGUiOjEwMDAsIndpbmRvdyI6WyIwIiwiMSIsIjAiLCIxLjUiXX1d
		if (input < 0.13) {
			return (float) (1 + 4 * Math.pow(2.2 * t - 1, 3) + 3 * Math.pow(2.3 * t - 1, 2));
		}
		return (float) (1 + 0.2 * Math.sin(22 + t * 4 * Math.PI * 2) / Math.exp(2 * t));
	}
}
