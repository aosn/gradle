package com.example.util;

import java.math.BigDecimal;


/**
 * 高精度の四則演算を行うライブラリです
 * <p>
 * {@link java.lang.String}または{@link java.math.BigDecimal}で表現されたにょろにょろ
 *
 *
 * </p>
 * @author Takumi
 * @version 0.1
 */
public class BasicArtihmetricOperations{


	/**
	 * {@link java.lang.String}}で表現された数値同士を加算します
	 * @param a
	 * @param b
	 * @return 2つの引数の和
	 * @throws java.lang.NumberFormatException
	 *
	 */
  public static BigDecimal plus(String a, String b){
    return plus(new BigDecimal(a),new BigDecimal(b) );
  }

  /**
   * {@link java.math.BigDecimal}型の数値同士を加算します。
   *
   */
  public static BigDecimal plus(BigDecimal a, BigDecimal b){
	  return a.add(b);
  }


}
