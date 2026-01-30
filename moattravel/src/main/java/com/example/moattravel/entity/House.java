package com.example.moattravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/*
 * クラスに@Entityアノテーションをつけることで、
 * そのクラスがエンティティとして機能するようになる。
 */
@Entity

/*
 * @Tableアノテーションをつけることで、
 * そのエンティティにマッピング（対応付け）されるテーブル名を指定できる。
 * @Table(name = "houses")と指定すれば、
 * housesテーブルがそのエンティティにマッピングされる
 */
@Table(name = "houses")

/*
 * @Dateアノテーションをつけ、ゲッターやセッターを自動生成する
 * Lombok(依存関係)が提供するアノテーション。
 * @Dateアノテーションを付けることで、ゲッターやセッターを自動生成できる
 */
@Data

public class House {

	/*
	 * エンティティのフィールドに@Idアノテーションをつけることで
	 * そのフィールドを主キーに指定
	 * 
	 * @GeneratedValueアノテーションをつけて
	 * strategy = GenerationType.IDENTITYを指定することで
	 * テーブル内のAUTO_INCREMENTを指定したidカラムを利用して値を生成
	 * （データの作成時、更新時にidの値を自動採番される）
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	/*
	 * 各フィールドに@Columnアノテーションをつけ、対応するカラム名を指定
	 * エンティティの各フィールドに@Columnアノテーションをつけることで
	 * そのフィールドにマッピングされるカラム名を指定
	 * 
	 * ※カラム名の命名規則はローワキャメルケース(aaaBbb)が一般
	 */
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "image_name")
	private String imageName;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private Integer price;

	@Column(name = "capacity")
	private Integer capacity;

	@Column(name = "postar_code")
	private String postarCode;

	@Column(name = "address")
	private String address;

	@Column(name = "phone_number")
	private String phoneNumber;

	/*
	 * insertable属性 = 「そのカラムに値を挿入できるかどうか」
	 * updatable属性 = 「そのカラムの値を更新できるかどうか」
	 * 両者、デフォは(true) 、falseにすることでアプリ側で干渉ができなくなり
	 * 値の管理をデータベース側で任せられる
	 */
	@Column(name = "created_at", insertable = false, updatable = false)
	private Timestamp createdAt;

	@Column(name = "updated_at", insertable = false, updatable = false)
	private Timestamp updatedAt;
}
