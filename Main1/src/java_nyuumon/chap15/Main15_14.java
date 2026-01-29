package java_nyuumon.chap15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//InstantとZonedDateTimeを利用する
public class Main15_14 {

	public static void main(String[] args) {

		//Instantの生成
		Instant i1 = Instant.now(); //現在日時（世界標準時）を取得

		//Inatant とlong値との相互関係
		Instant i2 = Instant.ofEpochMilli(1600705435827L);
		long l = i2.toEpochMilli(); // l = エポックミリ秒？

		//ZonedDateTimeの作成
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo")); //東京時間2023年1月2日3時4分5秒6ナノ秒を指定して取得

		//InstantとZoneDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		//ZonedDateTimeの利用方法
		System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ習慣をさしています"); //同じ瞬間の判定にはequals()ではなくisEqual()を使用
		}
	}
}
