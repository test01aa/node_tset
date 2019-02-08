package jp.co.research01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
	public static void main(String[] args) {
		System.out.println("test desu");
		
		List<Z001> progress = new ArrayList<>();
		List<Z002> updateData = new ArrayList<>();

		//------------------------------------
		// 元データ
		//------------------------------------
		Z001 objZ001_01 = new Z001("01");
		Z001 objZ001_02 = new Z001("02");
		Z001 objZ001_03 = new Z001("03");
		progress.add(objZ001_01);
		progress.add(objZ001_02);
		progress.add(objZ001_03);
		System.out.println("---- 元データ更新前");
		progress.forEach(data->{
			System.out.println("moto..." + data.getDetail() + " " + data.getK01_change_cnt() + " " + data.getK02_change_cnt());
		});
				
		//------------------------------------
		// 更新用データ
		//------------------------------------
		Z002 objZ002_01 = new Z002("01_detail" , "0" , "11" );
		Z002 objZ002_02 = new Z002("01_detail" , "1" , "12" );
		Z002 objZ002_03 = new Z002("01_detail" , "2" , "13" );		
		updateData.add(objZ002_01);
		updateData.add(objZ002_02);
		updateData.add(objZ002_03);
		
		//------------------------------------
		// 更新用データをmapに格納（01）
		//------------------------------------
		HashMap<String , String> updateDataMap01 = new HashMap<String , String>();
		System.out.println("---- 更新用データ 01");
		updateData.forEach(data->{
			updateDataMap01.put(data.getDetail() , data.getK01_change_cnt() );
			System.out.println("key..." +  data.getDetail()  + "data naiyou..." + data.getK01_change_cnt());
		});

		//------------------------------------
		// 元データを更新(01)
		//------------------------------------

		
		//------------------------------------
		// 更新用データをmapに格納（02）
		//------------------------------------
		HashMap<String , String> updateDataMap02 = new HashMap<String , String>();
		System.out.println("---- 更新用データ 02");
		updateData.forEach(data->{
			updateDataMap02.put(data.getDetail() , data.getK02_change_cnt() );
			System.out.println("key..." +  data.getDetail()  + "data naiyou..." + data.getK02_change_cnt());
		});

	}
}
