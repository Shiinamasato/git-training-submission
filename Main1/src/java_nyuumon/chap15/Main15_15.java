package java_nyuumon.chap15;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main15_15 {
//LocalDateTimeを利用する。
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		LocalDateTime l1 = LocalDateTime.now(); //現在日時を取得
		LocalDateTime l2 = LocalDateTime.of(2024, 1, 1, 9, 5, 0, 0);  //22024年 1月1日9時5分を指定して取得
		
		//LocalDateTimeとZoneDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		
	}

}
