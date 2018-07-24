package com.java1234.service;

public class CreatExl {
    /** Excel 文件要存放的位置，假定在D盘下*/
    public static String outputFile="D:\\test.xls";
    /*
    public static void main(String argv[]){
        try{
            // 创建新的Excel 工作簿
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 在Excel工作簿中建一工作表，其名为缺省值
            // 如要新建一名为"效益指标"的工作表，其语句为：
            // HSSFSheet sheet = workbook.createSheet("sheet1");
            HSSFSheet sheet = workbook.createSheet();
            // 在索引0的位置创建行（第一行）
            HSSFRow row = sheet.createRow((short)0);
            //在索引0的位置创建单元格（第一列）
            HSSFCell cell = row.createCell((short) 0);
            // 定义单元格为字符串类型（Excel-设置单元格格式-数字-文本；不设置默认为“常规”，也可以设置成其他的，具体设置参考相关文档）
            cell.setCellType(HSSFCell.CELL_TYPE_STRING);
            // 在单元格中输入一些内容
            cell.setCellValue("啊哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
            // 新建一输出文件流
            FileOutputStream fOut = new FileOutputStream(outputFile);
            // 把相应的Excel 工作簿存盘
            workbook.write(fOut);
            fOut.flush();
            // 操作结束，关闭文件
            fOut.close();
            System.out.println("文件生成");
        }catch(Exception e) {
            System.out.println("已运行 xlCreate() : " + e );
        }
    }
    */
}