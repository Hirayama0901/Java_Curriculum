package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import sub.Data; 

public class Prefectures {
	/*
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
 */
	public static void main(String[] args) {
		Data[] prefectures = {
			new Data("北海道", "札幌市", 83424),
			new Data("青森県", "青森市", 9646),
			new Data("岩手県", "盛岡市", 15275),
			new Data("宮城県", "仙台市", 7282),
			new Data("秋田県", "秋田市", 11638),
			new Data("山形県", "山形市", 9323),
			new Data("福島県", "福島市", 13784),
			new Data("茨城県", "水戸市", 6097),
			new Data("栃木県", "宇都宮市", 6408),
			new Data("群馬県", "前橋市", 6362),
			new Data("埼玉県", "さいたま市", 3798)
		};
		System.out.println("「8,5,9」のようにカンマ区切りで数字(1から11)を入力してください");
		Scanner scan = new Scanner(System.in);
		String[] elements = scan.nextLine().split(",");
		
		System.out.println("昇順でソートする場合は 「asc」、降順でソートする場合は 「desc」 を入力してください");
		String order = scan.nextLine();
		Date info = new Date();
		if (order.equals("asc")) {
			Arrays.sort(elements);
			for (String value : elements) {
				prefectures[Integer.parseInt(value) - 1].getData();
			}
		} else if (order.equals("desc")) {
			Arrays.sort(elements, Collections.reverseOrder());
			for (String value : elements) {
				prefectures[Integer.parseInt(value) - 1].getData();
			}
		}
	}
}
