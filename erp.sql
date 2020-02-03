DROP DATABASE erptable;
CREATE DATABASE erptable;
USE erptable;

/*===============================基础数据===============================*/
##仓库表
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `WareHouseID` VARCHAR(10) DEFAULT NULL COMMENT '仓库编号',
  `WareHouseName` VARCHAR(20) DEFAULT NULL COMMENT '仓库名称',
  `ShortName` VARCHAR(20) DEFAULT NULL COMMENT '仓库简称',
  `EngName` VARCHAR(20) DEFAULT NULL COMMENT '英文名称',
  `LinkMan` VARCHAR(20) DEFAULT NULL COMMENT '联系人员',
  `Telephone` VARCHAR(20) DEFAULT NULL COMMENT '联系电话',
  `WareHouseAddress` VARCHAR(50) DEFAULT NULL COMMENT '仓库地址',
  `Memo` VARCHAR(200) DEFAULT NULL COMMENT '备注'
) COMMENT='仓库表' CHARSET=utf8;

##department部门表
DROP TABLE IF EXISTS `department`;
CREATE TABLE department(
DepartID VARCHAR(10) COMMENT '部门编号' PRIMARY KEY ,
DepartName VARCHAR(20) NOT NULL COMMENT '部门名称',
EngName VARCHAR(20) COMMENT '英文名称',
Memo VARCHAR(200) COMMENT '备注',
Female INT COMMENT '女性',
Male INT COMMENT '男性',
SalaryTypeID VARCHAR(11) COMMENT '工资方案',
SalaryClassName VARCHAR(20) COMMENT '方案名称',
CalID VARCHAR(11) COMMENT '行事历'
)COMMENT='部门表' CHARSET=utf8;

##customercategory客户类别表
DROP TABLE IF EXISTS `customercategory`;
CREATE TABLE customercategory(
ClassID VARCHAR(10) PRIMARY KEY,
ClassName VARCHAR(20),
EngName VARCHAR(20),
Memo VARCHAR(200)
)COMMENT='客户类别表' CHARSET=utf8;

##客户主文件
DROP TABLE IF EXISTS `customermaster`;
CREATE TABLE customermaster(
Cmid INT PRIMARY KEY AUTO_INCREMENT COMMENT'客户编号',
FundsAttribution VARCHAR(50) COMMENT'账款归属',
FullName VARCHAR(50) COMMENT'客户全称',
ClassID VARCHAR(50) COMMENT'类别编号',
ShortName VARCHAR(50) COMMENT'客户简称',
`Sarea` VARCHAR(50) COMMENT'地区',
EngFullName VARCHAR(50) COMMENT'英文全称',
EngShortName VARCHAR(50) COMMENT'英文简称',
CurrencyID VARCHAR(50) COMMENT'币别',
ChiefName VARCHAR(50) COMMENT'负责人',
LinkMan VARCHAR(50) COMMENT'联系人',
PersonID VARCHAR(50) COMMENT'业务人员',
TaxNo VARCHAR(50) COMMENT'税务登记号',
Capitalization DOUBLE COMMENT'资本额',
IndustrialClass VARCHAR(50) COMMENT'行业别',
Email VARCHAR(50) COMMENT'电子邮件',
WebAddress VARCHAR(50) COMMENT'网址',
FaxNo VARCHAR(50) COMMENT'传真号码',
Telephone1 VARCHAR(50) COMMENT'联系电话一',
Telephone2 VARCHAR(50) COMMENT'联系电话二',
Telephone3 VARCHAR(50) COMMENT'联系电话三',
MobileTel VARCHAR(50) COMMENT'移动电话',
BankAccount VARCHAR(50) COMMENT'银汉账户',
BankID VARCHAR(50) COMMENT'开户银行',
EarliestTradeDate DATE COMMENT'最初销售出库日',
FirstTradeDate DATE COMMENT'最初销售退货日',
LatelyTradeturnDate DATE COMMENT'最近销售入库日',
LatelyReturnDate DATE COMMENT'最近销售退货日',
RateOfDiscount DOUBLE COMMENT'折数',
PriceRank INT COMMENT'售折等级',
PriceofTax INT COMMENT'单价是否含税',
TransNewID VARCHAR(50) COMMENT'潜在客户编号',
BuildUpDate DATE COMMENT'客户建立日期',
InvalidDate DATE COMMENT'终止交易日',
AmountQuota DOUBLE COMMENT'账款额度',
RemainQuota DOUBLE COMMENT'剩余额度',
RecvWay INT COMMENT'收款方式',
DistDays INT COMMENT'收款天数',
DayOfClose INT COMMENT'每月结账日',
CreditLevel VARCHAR(50) COMMENT'信用等级',
StartAdvRecv DOUBLE COMMENT'期初预收款',
StartReceivable DOUBLE COMMENT'期初应收款',
CurAdvRecv DOUBLE COMMENT'期末预收款',
CurReceivable DOUBLE COMMENT'期末应收款',
WMoney DOUBLE COMMENT'未开票金额',
YAdvRecv VARCHAR(50) COMMENT'预收账款科目',
Remark VARCHAR(200) COMMENT'备注',
Column1 VARCHAR(50) COMMENT'Column1',
Column2 VARCHAR(50) COMMENT'Column2',
Column3 VARCHAR(50) COMMENT'Column3'	
)COMMENT='客户主文件' CHARSET=utf8;

##currency币别表
DROP TABLE IF EXISTS `currency`;
CREATE TABLE currency(
CurrencyID VARCHAR(20) PRIMARY KEY COMMENT '币别编号',
CurrencyName VARCHAR(20) NOT NULL COMMENT '币别名称',
ShortName VARCHAR(20) COMMENT '币别简称',
EngName VARCHAR(20) COMMENT '英文名称',
ModifyDate DATE NOT NULL COMMENT '异动日期',
FixedRate DOUBLE  COMMENT '固定汇率',
BuyInRate DOUBLE COMMENT '买进汇率',
SellOutRate DOUBLE  COMMENT '卖出汇率',
PriceDeciDigits VARCHAR(20) COMMENT '单价位数',
AmountDeciDigits VARCHAR(20) COMMENT '金额位数'
)COMMENT='币别表' CHARSET=utf8;

##计量单位
DROP TABLE IF EXISTS `tunit`;
CREATE TABLE tunit(
UnitID INT PRIMARY KEY AUTO_INCREMENT COMMENT'单位编号',
UnitName VARCHAR(50) COMMENT'单位名称',
EngName VARCHAR(50) COMMENT'英文名称',
Memo VARCHAR(200) COMMENT'备注'
)COMMENT='计量单位' CHARSET=utf8;

##供应商类别表
DROP TABLE IF EXISTS `suppliercategory`;
CREATE TABLE suppliercategory(
ClassID VARCHAR(10) COMMENT '类别编号' PRIMARY KEY,
ClassName VARCHAR(20) NOT NULL COMMENT '类别名称',
EngName VARCHAR(20) COMMENT '英文名称',
Memo VARCHAR(200)  COMMENT '备注'
)COMMENT='供应商类别表' CHARSET=utf8;

##供应商表
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE supplier(
sid VARCHAR(20) PRIMARY KEY,
fullName VARCHAR(30),
shortName VARCHAR(20),
engFullName VARCHAR(30),
engShortName VARCHAR(20),
fundsAttribution VARCHAR(20),
classId VARCHAR(10),
`area` VARCHAR(20),
currencyId VARCHAR(10),
chiefName VARCHAR(20),
linkMan VARCHAR(20),
personID VARCHAR(20),
taxNo	VARCHAR(20),
capitalization	DOUBLE,
industrialClass	VARCHAR(20),
email VARCHAR(20),
webAddress VARCHAR(20),
faxNo VARCHAR(20),
telephone1 VARCHAR(20),
telephone2 VARCHAR(20),
telephone3 VARCHAR(20),
mobilephone VARCHAR(20),
bankAccount VARCHAR(20),
bank VARCHAR(20),
priceOfTax INT,
invalidDate INT,
earliestTradeDate DATE,
firstTradeDate DATE,
latelyTradeDate	DATE,
latelyReturn DATE,
startAdvRecv DOUBLE,
startReceivable	DOUBLE,
amountQuota DOUBLE,
recvWay	INT,
distDays INT,
dayOfClose INT,
dayOfRecv INT,
creditLevel VARCHAR(10),
memao VARCHAR(200),
coulumn1 VARCHAR(50),
coulumn2 VARCHAR(50),
coulumn3 VARCHAR(50)
)COMMENT='供应商表' CHARSET=utf8;

##物料类别
DROP TABLE IF EXISTS `tmaterialcategory`;
CREATE TABLE tmaterialcategory(
ClassID INT PRIMARY KEY AUTO_INCREMENT COMMENT'类别编号',
ClassName VARCHAR(50) COMMENT'类别名称',
EngName VARCHAR(50) COMMENT'英文名称',
AccInventoryID VARCHAR(50) COMMENT'存货科目',
AccSaleID VARCHAR(50) COMMENT'销售收入科目',
AccSaleCostID VARCHAR(50) COMMENT'销售成本科目',
SendOutWareID VARCHAR(50) COMMENT'发出商品科目',
GiftExpenseID VARCHAR(50) COMMENT'赠品费用科目',
OtherIncomeID VARCHAR(50) COMMENT'其他收入科目',
OtherExpenseID VARCHAR(50) COMMENT'其他成本科目',
Memo VARCHAR(50) COMMENT'备注'
)COMMENT='物料类别' CHARSET=utf8;

##物料主文件
DROP TABLE IF EXISTS `materialmaster`;
CREATE TABLE materialmaster(
ProdID VARCHAR(20) NOT NULL PRIMARY KEY COMMENT'物料编号',
ProdName VARCHAR(30) NOT NULL COMMENT'物料名称',
ProdSize VARCHAR(30) COMMENT'规格型号',
EngName VARCHAR(30) COMMENT'英文品名',
ClassID VARCHAR(10) NOT NULL COMMENT'物料类别',
StdUnitID INT(11) NOT NULL COMMENT'计量单位',
BarCodeID VARCHAR(10) COMMENT'条形码编号',
SuggestPrice DOUBLE COMMENT'建议售价',
CurrID INT(11) NOT NULL COMMENT'使用币别',
ProdForm VARCHAR(30) COMMENT'物料形态',
PriceOfTax INT(11) COMMENT'单价是否含税',
TaxItemsID INT(11) NOT NULL COMMENT'税目',
BusiTaxRate DOUBLE COMMENT'税率',
AdvanceDays INT(11) COMMENT'采购提前期',
MajorSupplier INT(11) COMMENT'主供应商',
SalesPriceA DOUBLE COMMENT'售价A',
SalesPriceB DOUBLE COMMENT'售价B',
SalesPriceC DOUBLE COMMENT'售价C',
SalesPriceD DOUBLE COMMENT'售价D',
SalesPriceE DOUBLE COMMENT'售价E',
StdPrice DOUBLE COMMENT'标准进价',
BatchUsed INT(11) COMMENT'使用批号管理',
EffectDateUsed INT(11) COMMENT'使用出厂日期',
ValidDateUsed INT(11) COMMENT'使用有效日期',
DefValidDay INT(11) COMMENT'有效天数',
SafeQty INT(11) COMMENT'安全存量',
BAvgCost DOUBLE COMMENT'平均成本',
BStdCost DOUBLE COMMENT'标准成本',
CAvgCost DOUBLE COMMENT'现行平均成本',
CStdCost DOUBLE COMMENT'标准总成本',
BOutStockDay DATE COMMENT'最初出库日',
BInStockDay DATE COMMENT'最初入库日',
InvalidDate DATE COMMENT'停用日期',
ProdDesc VARCHAR(200) COMMENT'物料说明', 
Coulumn1 VARCHAR(50) COMMENT'Coulumn1', 
Coulumn2 VARCHAR(50) COMMENT'Coulumn2', 
Coulumn3 VARCHAR(50) COMMENT'Coulumn3'
)COMMENT='物料主文件' CHARSET=utf8;

/*======================================================================*/


/*================================共用表================================*/

##库存总账表
DROP TABLE IF EXISTS `storeaccount`;
CREATE TABLE storeaccount(
lineNo INT(11) NOT NULL PRIMARY KEY COMMENT'行号',
WareHouseID VARCHAR(10) NOT NULL COMMENT'仓库编号',
ProdID VARCHAR(20) NOT NULL COMMENT'物料编号',
BAllAmt INT(11) COMMENT'期初数量',
CAllAmt INT(11) COMMENT'现在数量',
sPrice DOUBLE  COMMENT'单价成本',
CAllCost DOUBLE COMMENT'现行总成本',
SafeQty INT(11) COMMENT'安全存量',
FBegPrice DOUBLE COMMENT'期初单价',
FBegSum DOUBLE COMMENT'期初金额',
January INT(11) COMMENT'现有值',
Period INT(11) COMMENT'期初值(默认0)'
)COMMENT='库存总账表' CHARSET=utf8;

##库存流水表
DROP TABLE IF EXISTS `storeio`;
CREATE TABLE storeio(
LineNo INT(11) NOT NULL PRIMARY KEY COMMENT'行号',
FromNO VARCHAR(20) COMMENT'来源单号',
TranType VARCHAR(20) COMMENT'来源单别',
WareHouseID VARCHAR(10) NOT NULL COMMENT'数量，入库为正，出库为负',
sQuantity INT(11) COMMENT'数量，入库为正，出库为负',
CMID VARCHAR(20) NOT NULL COMMENT'客户编号',
SID VARCHAR(10) NOT NULL COMMENT'供应商编号',
sPrice DOUBLE COMMENT'单价',
Amount DOUBLE COMMENT'总金额',
outintime DATE COMMENT'出入库时间'
)COMMENT='库存流水表' CHARSET=utf8;

##供应商地址表
DROP TABLE IF EXISTS `supplieraddress`;
CREATE TABLE supplieraddress(
id INT PRIMARY KEY AUTO_INCREMENT,
sid VARCHAR(20),
address VARCHAR(200),
postCode VARCHAR(20),
contacts VARCHAR(20),
contactsTOT VARCHAR(20),
phone VARCHAR(20),
faxcode VARCHAR(20),
path VARCHAR(200),
remark VARCHAR(200)
)COMMENT='供应商地址表' CHARSET=utf8;

##员工表
DROP TABLE IF EXISTS `employee`;
CREATE TABLE employee(
personID VARCHAR(20) PRIMARY KEY,
`name` VARCHAR(20),
`pwd` VARCHAR(20),
englishName VARCHAR(50),
departID VARCHAR(10),
sex INT,
idCard VARCHAR(20),
birthday DATE,
duty VARCHAR(20),
postCode VARCHAR(20),
phone VARCHAR(20),
entryDate DATE,
regularizationdate DATE,
dimissiondate DATE,
address VARCHAR(100),
state INT,
remark VARCHAR(200),
custom1 VARCHAR(200),
custom2 VARCHAR(200),
custom3 VARCHAR(200),
custom4 VARCHAR(200)
)COMMENT='员工表' CHARSET=utf8;

/*======================================================================*/


/*==============================库存子系统==============================*/

##盘点单表
DROP TABLE IF EXISTS `blitem`;
CREATE TABLE blitem(
  BillNo VARCHAR(20) PRIMARY KEY,
  AdjustDate DATE NOT NULL,
  WareID INT NOT NULL,
  VoucherNo VARCHAR(20),
  IncSubjectID INT,
  DecSujectID INT,
  ZeroFilter INT,
  SalesID INT,
  DepartID INT,
  Maker VARCHAR(20),
  Permitter VARCHAR(20),
  Remark VARCHAR(200)
)COMMENT='盘点单表' CHARSET=utf8;

##盘点单详细表
DROP TABLE IF EXISTS `blitemDetails`;
CREATE TABLE blitemDetails(
  BillNo VARCHAR(20) PRIMARY KEY,
  ProdID VARCHAR(20) NOT NULL,
  ProdName VARCHAR(20),
  ProdSize VARCHAR(50),
  Unit INT,
  CurQty INT,
  CheckQty INT,
  Quantity INT,
  Price FLOAT,
  Amount FLOAT,
  HaveBatch VARCHAR(20),
  ItemRemark VARCHAR(200)
)COMMENT='盘点单详细表' CHARSET=utf8;

##调价主表
DROP TABLE IF EXISTS `modifyprice`;
CREATE TABLE modifyprice(
MPId VARCHAR(30) PRIMARY KEY,
AdjustDate DATE,
IncSubjectId VARCHAR(30),
DecSubjectId VARCHAR(30),
VoucherNo VARCHAR(30),
ArrangeStyle VARCHAR(30),
Maker VARCHAR(30),
Permitter VARCHAR(30),
`Status` VARCHAR(30),
Column1 VARCHAR(30),
Column2 VARCHAR(30)
)COMMENT='调价主表' CHARSET=utf8;

##调价详表
DROP TABLE IF EXISTS `modifypricedetails`;
CREATE TABLE modifypricedetails(
MPDId VARCHAR(30) ,
MPId VARCHAR(30),
ProdId VARCHAR(30),
ProdName VARCHAR(30),
ProdSize VARCHAR(30),
Unit VARCHAR(30),
CurQty INT,
LCostAvg DOUBLE,
Price DOUBLE,
Amount DOUBLE,
Remarks VARCHAR(50),
Column1 VARCHAR(30),
Column2 VARCHAR(30),
Column3 VARCHAR(30),
PRIMARY KEY(MPDId,MPId)
)COMMENT='调价详表' CHARSET=utf8;

##调拨单表
DROP TABLE IF EXISTS `transfer`;
CREATE TABLE transfer(
  BillNo VARCHAR(20) PRIMARY KEY,
  AdjustDate DATE NOT NULL,
  WareID INT NOT NULL,
  WareinID INT,
  Maker VARCHAR(20),
  Permitter VARCHAR(20),
  Remark VARCHAR(200)
)COMMENT='调拨单表' CHARSET=utf8;

##调拨单详细表
DROP TABLE IF EXISTS `transferDetails`;
CREATE TABLE transferDetails(
   BillNo VARCHAR(20) PRIMARY KEY,
   ProdID VARCHAR(20) NOT NULL,
   ProdName VARCHAR(50),
   ProdSize VARCHAR(50), 
   Unit VARCHAR(20),
   CurQty INT,
   HaveBatch VARCHAR(20),
   ItemRemark VARCHAR(200),
   ServiceValidity VARCHAR(50),
   Coulumn1 VARCHAR(50),
   Coulumn2 VARCHAR(50) 
)COMMENT='调拨单详细表' CHARSET=utf8;

/*======================================================================*/


/*==============================销售子系统==============================*/

##销售报价表
DROP TABLE IF EXISTS `salesrequisitions`;
CREATE TABLE salesrequisitions(
customerID VARCHAR(50) COMMENT'客户编号',
BillNo VARCHAR(50) COMMENT'单据号码',
BillDate DATE COMMENT'单据日期',
DeliveryAddress VARCHAR(50) COMMENT'送货地址',
EffectiveDate DATE COMMENT'有效日期',
CurrencyID INT COMMENT'币别编号',
TaxInclusive INT COMMENT'单价是否含税',
ExchangeRate DOUBLE COMMENT'汇率',
SalesID INT COMMENT'业务人员',
DepartID INT COMMENT'所属部门',
Maker VARCHAR(50) COMMENT'制单人员',
Permitter VARBINARY(50) COMMENT'复核人员',
Audit INT COMMENT'是否审核',
Remark VARCHAR(200) COMMENT'备注',
column1 VARCHAR(50) COMMENT'column1',
column2 VARCHAR(50) COMMENT'column2',
column3 VARCHAR(50) COMMENT'column3'	
)COMMENT='销售报价表' CHARSET=utf8;

##销售报价明细表
DROP TABLE IF EXISTS `salesrequisitionsdetails`;
CREATE TABLE salesrequisitionsdetails(
SerNO VARCHAR(50) COMMENT'栏号',
ProdID VARCHAR(50) COMMENT'物料编号',
ProdName VARCHAR(50) COMMENT'物料名称',
ProdSize VARCHAR(50) COMMENT'规格型号',
UnitName VARCHAR(50) COMMENT'单位名称',
sQuantity INT COMMENT'数量',
ZkqPrice DOUBLE COMMENT'折扣前单价',
Discount DOUBLE COMMENT'折数',
UnitPrice DOUBLE COMMENT'单价',
Price DOUBLE COMMENT'金额',
TaxRate DOUBLE COMMENT'税率',
Taxlimit DOUBLE COMMENT'税额',
TaxInclusivePrice DOUBLE COMMENT'含税金额',
Complimentart INT COMMENT'赠品',
ItemRemark VARCHAR(50) COMMENT'分录备注'
)COMMENT='销售报价明细表' CHARSET=utf8;

##销售订单
DROP TABLE IF EXISTS `salesorders`;
CREATE TABLE salesorders(
customerID VARCHAR(50) COMMENT'客户编号',
BillNo VARCHAR(50) COMMENT'单据号码',
DeliveryAddress VARCHAR(50) COMMENT'送货地址',
BillDate DATE COMMENT'单据日期',
SalesStyleID INT COMMENT'销售订单类型',
Clientorder VARCHAR(50) COMMENT'客户订单',
PriceOfTax INT COMMENT'单价是否含税',
CurrencyID INT COMMENT'币别编号',
`Condition` INT COMMENT'单情',
ExchRate DOUBLE COMMENT'汇率',
SalesNameID INT COMMENT'业务人员',
DepartID INT COMMENT'所属部门',
Maker VARCHAR(50) COMMENT'制单人员',
Permitter VARCHAR(50) COMMENT'复核人员',
PojectName INT COMMENT'所属项目',
Remark VARCHAR(200) COMMENT'备注',
Audit INT COMMENT'审核',
column1 VARCHAR(50) COMMENT'column1',
column2 VARCHAR(50) COMMENT'column2',
column3 VARCHAR(50) COMMENT'column3'
)COMMENT='销售订单' CHARSET=utf8;

##销售订单明细表
DROP TABLE IF EXISTS `salesorderdetails`;
CREATE TABLE salesorderdetails(
LineNo INT COMMENT'栏号',
ProdID VARCHAR(50) COMMENT'物料编号',
ProdName VARCHAR(50) COMMENT'物料名称',
ProdSize VARCHAR(50) COMMENT'规格型号',
UnitName VARCHAR(50) COMMENT'单位名称',
sQuantity INT COMMENT'数量',
OldPrice DOUBLE COMMENT'折扣前单价',
Discount DOUBLE COMMENT'折数',
sPrice DOUBLE COMMENT'单价',
Amount DOUBLE COMMENT'金额',
TaxRate DOUBLE COMMENT'税率',
TaxAmt DOUBLE 	COMMENT'税额',
VFTotal DOUBLE COMMENT'含税金额',
HasThsQuantity INT COMMENT'期初已出数量',
PreInDate DATE COMMENT'预出库日',
QtyRemain INT COMMENT'未出库量',
IsGift INT COMMENT'是否赠品',
TranType VARCHAR(50) COMMENT'来源单别',
FromNo VARCHAR(50) COMMENT'来源单号',
Clients VARCHAR(50) COMMENT'账款归属',
GatheringDate DATE COMMENT'收款日期',
GatheringCondition INT COMMENT'收款条件',
Gatheringt INT COMMENT'收款条件',
Gatheringtday INT COMMENT'收款天数',
ItemRemark INT COMMENT'分录备注',
Remark VARCHAR(200) COMMENT'备注',
State INT COMMENT'审核'	
)COMMENT='销售订单明细表' CHARSET=utf8;

##收款条件
DROP TABLE IF EXISTS `collectionterms`;
CREATE TABLE collectionterms(
id INT  PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
`name` VARCHAR(50) COMMENT'名称'
)COMMENT='收款条件' CHARSET=utf8;

##销售订单类型
DROP TABLE IF EXISTS `salestype`;
CREATE TABLE salestype(
id INT PRIMARY KEY AUTO_INCREMENT COMMENT'类型编号',
`name` VARCHAR(50) COMMENT'类型名称'
)COMMENT='销售订单类型' CHARSET=utf8;

##销售出库主表
DROP TABLE IF EXISTS `salestype`;
CREATE TABLE saleStock(
xschukuid INT PRIMARY KEY AUTO_INCREMENT COMMENT'销售单据id',
xschukuNo   VARCHAR(20)COMMENT'销售单据编号',
customerID VARCHAR(20)COMMENT'客户编号',
danjuDate DATE COMMENT'单据日期',
xschukulx VARCHAR(30)COMMENT'销售出库类型',
CurrencyID VARCHAR(20)COMMENT'币别编号',
danjiahsif INT COMMENT'单价是否含税',
WareHouseID VARCHAR(20) COMMENT'仓库编号',
gwmy VARCHAR(20) COMMENT'国外贸易',
pzbm VARCHAR(20) COMMENT'凭证编号',
beizu VARCHAR(200) COMMENT'备注',
DepartID VARCHAR(200) COMMENT'部门id',
Maker VARCHAR(20) COMMENT'制单人员',
Permitter VARCHAR(20) COMMENT'复核人员',
fuhestates VARCHAR(20) COMMENT'复核状态'
)COMMENT='销售出库主表' CHARSET=utf8;

##销售出库详表
DROP TABLE IF EXISTS `salestype`;
CREATE TABLE salestockdetails(
xschukuid 	 VARCHAR(20) COMMENT'销售出库主表编号',
LineNo	INT	PRIMARY KEY COMMENT'行号',
ProdID	VARCHAR(50) COMMENT'物料编号',
ProdName	VARCHAR(50) COMMENT'物料名称',
ProdSize	VARCHAR(50) COMMENT'规格型号',
UnitName	VARCHAR(50) COMMENT'单位名称',
sQuantity	INT	COMMENT'数量',		
OldPrice	DOUBLE	COMMENT'标准进价',
Discount	DOUBLE	COMMENT'折数',
sPrice	DOUBLE		COMMENT'单价',
Amount	DOUBLE		COMMENT'金额',
TaxRate	DOUBLE		COMMENT'税率',
TaxAmt	DOUBLE		COMMENT'税额',
VFTotal	DOUBLE		COMMENT'含税金额',
HaveBatch	VARCHAR(50) COMMENT'批号', 
IsGift	INT		COMMENT'是否赠品',
ItemRemark	VARCHAR(50) COMMENT'分录备注',
FromNO	VARCHAR(50) COMMENT'来源单号',					
TranType	VARCHAR(20) COMMENT'来源单别'
)COMMENT='销售出库详表' CHARSET=utf8;

##销售退货主表
DROP TABLE IF EXISTS `salestype`;
CREATE TABLE salesReturn(
BillNo	VARCHAR(20) PRIMARY KEY  COMMENT'销售退货单据号码',	
BillDate	DATE  COMMENT'单据日期',	
CurrencyID	VARCHAR(10)  COMMENT'币别',
ExchRate	DOUBLE  COMMENT'汇率',	
HasForeignTrade	VARCHAR(20) COMMENT'国外贸易',	
CustID	VARCHAR(20) COMMENT'客户编号',	
AddressID	VARCHAR(50) COMMENT'客户地址地址',
PriceOfTax	INT	 COMMENT'单价是否含税',
WareHouseID	VARCHAR(20) COMMENT'仓库编号',
ISDeduct	INT	 COMMENT'重新入库',	
VoucherNO	VARCHAR(20) COMMENT'凭证编号',	
Maker	VARCHAR(20) COMMENT'制单人员',	
Permitter	VARCHAR(20) COMMENT'复核人员',	
Project	VARCHAR(20) COMMENT'所属项目',
Remark	VARCHAR(200) COMMENT'备注',	
fuhestates  	INT	 COMMENT'复核状态'	
)COMMENT='销售退货主表' CHARSET=utf8;

##销售退货详表
DROP TABLE IF EXISTS `salestype`;
CREATE TABLE salesreturndetails(
LineNo	INT PRIMARY KEY COMMENT'行号',
BillNo	VARCHAR(20) COMMENT'销售退货主表编号',
ProdID	VARCHAR(20) COMMENT'物料编号',
ProdName	VARCHAR(20) COMMENT'物料名称',
ProdSize	VARCHAR(20) COMMENT'规格型号',
UnitName	VARCHAR(20) COMMENT'单位名称',
sQuantity	INT COMMENT'数量',
OldPrice	DOUBLE COMMENT'标准进价',
Discount	DOUBLE	 COMMENT'折数',
sPrice	DOUBLE	 COMMENT'单价',
Amount	DOUBLE	 COMMENT'金额',
TaxRate	DOUBLE	 COMMENT'税率',
TaxAmt	DOUBLE	 COMMENT'税额',
VFTotal	DOUBLE	 COMMENT'含税金额',
HaveBatch	VARCHAR(20) COMMENT'批号',
IsGift	INT	 COMMENT'是否赠品',
ItemRemark	VARCHAR(20) COMMENT'分录备注',
FromNO	VARCHAR(200) COMMENT'来源单号',
TranType	VARCHAR(20) COMMENT'来源单别'
)COMMENT='销售退货详表' CHARSET=utf8;

##应收冲款单表
DROP TABLE IF EXISTS `tdebitotereceivablemenu`;
CREATE TABLE `tdebitnotereceivablemenu` (
  `LineNo` INT(11) NOT NULL AUTO_INCREMENT COMMENT '行号',
  `ReceivableNo` VARCHAR(20) DEFAULT NULL COMMENT '单据号码',
  `CurrencyID` VARCHAR(10) DEFAULT NULL COMMENT '币别',
  `ExchRate` DOUBLE DEFAULT NULL COMMENT '汇率',
  `ID` VARCHAR(10) NOT NULL COMMENT '客户表编号',
  `BillDate` DATE NOT NULL COMMENT '单据日期',
  `ClearingOne` VARCHAR(10) DEFAULT NULL COMMENT '结算方式一',
  `Paymentamout1` DOUBLE DEFAULT NULL COMMENT '支付金额一',
  `ClearingTwo` VARCHAR(10) DEFAULT NULL COMMENT '结算方式二',
  `Paymentamout2` DOUBLE DEFAULT NULL COMMENT '支付金额二',
  `ClearingThree` VARCHAR(10) DEFAULT NULL COMMENT '结算方式三',
  `Paymentamout3` DOUBLE DEFAULT NULL COMMENT '支付金额三',
  `DiscountRate` DOUBLE DEFAULT NULL COMMENT '折扣率',
  `TerminationMouth` DATE DEFAULT NULL COMMENT '终止账月',
  `VoucherId` VARCHAR(20) DEFAULT NULL COMMENT '凭证编号',
  `DepartId` VARCHAR(10) DEFAULT NULL COMMENT '所属部门',
  `Maker` VARCHAR(20) DEFAULT NULL COMMENT '制单人员',
  `Permitter` VARCHAR(20) DEFAULT NULL COMMENT '复核人员',
  `Project` VARCHAR(20) DEFAULT NULL COMMENT '所属项目',
  `Custom1` VARCHAR(20) DEFAULT NULL COMMENT '自定义栏1',
  `Custom2` VARCHAR(20) DEFAULT NULL COMMENT '自定义栏2',
  `Remark` VARCHAR(150) DEFAULT NULL COMMENT '备注',
  `State` INT(11) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`LineNo`)
) COMMENT='应收冲款单表' CHARSET=utf8;

##应收冲款单明细表
DROP TABLE IF EXISTS `tdebitnotereceivabledetail`;
CREATE TABLE `tdebitnotereceivabledetail` (
  `LineNo` INT(11) NOT NULL AUTO_INCREMENT COMMENT '行号',
  `ReceivableNo` VARCHAR(20) DEFAULT NULL COMMENT '应收冲款单编号',
  `Date` DATE DEFAULT NULL COMMENT '原单日期',
  `BillNo` VARCHAR(20) DEFAULT NULL COMMENT '原单单号',
  `Invoice` VARCHAR(20) DEFAULT NULL COMMENT '发票号码',
  `CustID` VARCHAR(10) DEFAULT NULL COMMENT '交易对象（编号）',
  `TradingName` VARCHAR(20) DEFAULT NULL COMMENT '交易对象名称',
  `DepartID` VARCHAR(10) DEFAULT NULL COMMENT '部门编号',
  `DepartName` VARCHAR(20) DEFAULT NULL COMMENT '部门名称',
  `PersonID` VARCHAR(20) DEFAULT NULL COMMENT '业务人员',
  `ObjectName` VARCHAR(20) DEFAULT NULL COMMENT '项目名称',
  `CurrencyID` VARCHAR(10) DEFAULT NULL COMMENT '币别',
  `ExchRate` DOUBLE DEFAULT NULL COMMENT '汇率',
  `YdanMoney` DOUBLE DEFAULT NULL COMMENT '原单金额',
  `XXingMoney` DOUBLE DEFAULT NULL COMMENT '现行金额',
  `ZRangMoney` DOUBLE DEFAULT NULL COMMENT '折让金额',
  `CKuanMoney` DOUBLE DEFAULT NULL COMMENT '冲款金额',
  `CDiMoney` DOUBLE DEFAULT NULL COMMENT '冲抵金额',
  PRIMARY KEY (`LineNo`)
) COMMENT='应收冲款单明细表' CHARSET=utf8;

##预收款单表
DROP TABLE IF EXISTS `tadvancesmenu`;
CREATE TABLE `tadvancesmenu` (
  `LineNo` INT(11) NOT NULL AUTO_INCREMENT COMMENT '行号',
  `ReceivableNo` VARCHAR(20) DEFAULT NULL COMMENT '单据号码',
  `CurrencyID` VARCHAR(10) DEFAULT NULL COMMENT '币别',
  `ExchRate` DOUBLE DEFAULT NULL COMMENT '汇率',
  `ID` VARCHAR(10) NOT NULL COMMENT '客户表编号',
  `BillDate` DATE NOT NULL COMMENT '单据日期',
  `ClearingOne` VARCHAR(10) DEFAULT NULL COMMENT '结算方式一',
  `Paymentamout1` DOUBLE DEFAULT NULL COMMENT '支付金额一',
  `ClearingTwo` VARCHAR(10) DEFAULT NULL COMMENT '结算方式二',
  `Paymentamout2` DOUBLE DEFAULT NULL COMMENT '支付金额二',
  `ClearingThree` VARCHAR(10) DEFAULT NULL COMMENT '结算方式三',
  `Paymentamout3` DOUBLE DEFAULT NULL COMMENT '支付金额三',
  `DiscountRate` DOUBLE DEFAULT NULL COMMENT '折扣率',
  `TerminationMouth` DATE DEFAULT NULL COMMENT '终止账月',
  `VoucherId` VARCHAR(20) DEFAULT NULL COMMENT '凭证编号',
  `DepartId` VARCHAR(10) DEFAULT NULL COMMENT '所属部门',
  `Maker` VARCHAR(20) DEFAULT NULL COMMENT '制单人员',
  `Permitter` VARCHAR(20) DEFAULT NULL COMMENT '复核人员',
  `Project` VARCHAR(20) DEFAULT NULL COMMENT '所属项目',
  `Custom1` VARCHAR(20) DEFAULT NULL COMMENT '自定义栏1',
  `Custom2` VARCHAR(20) DEFAULT NULL COMMENT '自定义栏2',
  `Remark` VARCHAR(150) DEFAULT NULL COMMENT '备注',
  `State` INT(11) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`LineNo`)
) COMMENT='预收款单表' CHARSET=utf8;

##预收款单明细表
DROP TABLE IF EXISTS `tadvancesdetail`;
CREATE TABLE `tadvancesdetail` (
  `LineNo` INT(11) NOT NULL AUTO_INCREMENT COMMENT '行号',
  `ReceivableNo` VARCHAR(20) DEFAULT NULL COMMENT '应收冲款单编号',
  `Date` DATE DEFAULT NULL COMMENT '原单日期',
  `BillNo` VARCHAR(20) DEFAULT NULL COMMENT '原单单号',
  `Invoice` VARCHAR(20) DEFAULT NULL COMMENT '发票号码',
  `CustID` VARCHAR(10) DEFAULT NULL COMMENT '交易对象（编号）',
  `TradingName` VARCHAR(20) DEFAULT NULL COMMENT '交易对象名称',
  `DepartID` VARCHAR(10) DEFAULT NULL COMMENT '部门编号',
  `DepartName` VARCHAR(20) DEFAULT NULL COMMENT '部门名称',
  `PersonID` VARCHAR(20) DEFAULT NULL COMMENT '业务人员',
  `ObjectName` VARCHAR(20) DEFAULT NULL COMMENT '项目名称',
  `CurrencyID` VARCHAR(10) DEFAULT NULL COMMENT '币别',
  `ExchRate` DOUBLE DEFAULT NULL COMMENT '汇率',
  `YdanMoney` DOUBLE DEFAULT NULL COMMENT '原单金额',
  `XXingMoney` DOUBLE DEFAULT NULL COMMENT '现行金额',
  `ZRangMoney` DOUBLE DEFAULT NULL COMMENT '折让金额',
  `CKuanMoney` DOUBLE DEFAULT NULL COMMENT '冲款金额',
  `CDiMoney` DOUBLE DEFAULT NULL COMMENT '冲抵金额',
  PRIMARY KEY (`LineNo`)
) COMMENT='预收款单明细表' CHARSET=utf8;

##应收款明细表
DROP TABLE IF EXISTS `gathering`;
CREATE TABLE `gathering` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '编号自增',
  `Billstype` VARCHAR(20) DEFAULT NULL COMMENT '单据类型',
  `BillsNo` VARCHAR(20) DEFAULT NULL COMMENT '单据编号',
  `Date` DATE DEFAULT NULL COMMENT '日期',
  `Kid` VARCHAR(20) DEFAULT NULL COMMENT '客户编号',
  `Payment` DOUBLE DEFAULT NULL COMMENT '应付金额',
  `Balance` DOUBLE DEFAULT NULL COMMENT '余额',
  `State` INT(11) DEFAULT NULL COMMENT '状态，0未完成，1完成',
  PRIMARY KEY (`Id`)
) COMMENT='应收款明细表' CHARSET=utf8;

##收款取用预收表
DROP TABLE IF EXISTS `gatheringprepay`;
CREATE TABLE `gatheringprepay` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '编号自增',
  `ReceivableNo` VARCHAR(20) DEFAULT NULL COMMENT '收款主表编号',
  `ReCeivableNo2` VARCHAR(20) DEFAULT NULL COMMENT '预收款主表编号',
  `LineNo` INT(11) DEFAULT NULL COMMENT '预收款详表编号',
  `Takenmoney` DOUBLE DEFAULT NULL COMMENT '取用金额',
  `State` INT(11) DEFAULT NULL COMMENT '状态，0未完成，1完成',
  PRIMARY KEY (`Id`)
) COMMENT='收款取用预收表' CHARSET=utf8;

/*======================================================================*/


/*==============================采购子系统==============================*/

##采购请购表
DROP TABLE IF EXISTS `purchaserequisitions`;
CREATE TABLE purchaserequisitions(
BillNo VARCHAR(10) COMMENT '单据号码' PRIMARY KEY,
BillDate DATE NOT NULL COMMENT '单据日期',
BillStyleID INT NOT NULL COMMENT '采购请购类型',
BillStatus INT  COMMENT '单况',
SalesID INT NOT NULL COMMENT '请购人员',
DepartID INT NOT NULL COMMENT '请购部门',
Maker VARCHAR(20) COMMENT '制单人员',
Permitter VARCHAR(20) COMMENT '复核人员',
Remark VARCHAR(200) COMMENT '备注',
Audit INT COMMENT '审核状态',
column1 VARCHAR(50) COMMENT 'column1',
Column2 VARCHAR(50) COMMENT 'column2',
Column3 VARCHAR(50) COMMENT 'column3'
)COMMENT='采购请购表' CHARSET=utf8;

##采购请购明细表
DROP TABLE IF EXISTS `purchaserequisitionsdetails`;
CREATE TABLE purchaserequisitionsdetails(
SerNO INT AUTO_INCREMENT COMMENT '行号' PRIMARY KEY,
ProdID DATE NOT NULL COMMENT '物料编号',
ProdName VARCHAR(30) COMMENT '物料名称',
ProdSize VARCHAR(30) COMMENT '规格型号',
SUnitID INT COMMENT '单位名称',
SQuantity INT DEFAULT 0 COMMENT '数量', 
CurrID INT COMMENT '币别',
SPrice DOUBLE COMMENT '标准进价',
Amount DOUBLE COMMENT '标准进价金额',
LastestCurrID INT COMMENT '最后一次交易币别',
LastestPrice DOUBLE COMMENT '最后一次交易单价',
LastestAmount DOUBLE COMMENT '最后一次交易进价金额',
PreInDate DATE COMMENT '需求日期',
SuggestPurDate DATE  COMMENT '建议采购日期',
QtyRemain INT COMMENT '未采购量',
Remark VARCHAR(50) COMMENT '备注',
TranType VARBINARY(20) COMMENT '来源单别',
FromNo VARBINARY(20) COMMENT '来源单号',
ItemRemark VARCHAR(50) COMMENT '分录备注'
)COMMENT='采购请购明细表' CHARSET=utf8;

##采购请购类型表
DROP TABLE IF EXISTS `purchaserequisitionsType`;
CREATE TABLE purchaserequisitionsType(
ClassID VARCHAR(10) COMMENT '类型编号' PRIMARY KEY,
ClassName VARCHAR(20) NOT NULL COMMENT '类型名称',
EngName VARCHAR(20) COMMENT '英文名称',
Memo VARCHAR(50) COMMENT '备注'
)COMMENT='采购请购类型表' CHARSET=utf8;

##采购询价表
DROP TABLE IF EXISTS `purchaseinquiry`;
CREATE TABLE purchaseinquiry(
BillNo VARCHAR(10) COMMENT '单据号码' PRIMARY KEY,
BillDate DATE NOT NULL COMMENT '单据日期',
CurrID INT NOT NULL COMMENT '币别',
ExchRate DOUBLE COMMENT '汇率',
CustomerID VARCHAR(20) NOT NULL COMMENT '供应商',
AddressID VARCHAR(50) COMMENT '供应商地址',
ValidDate DATE COMMENT '有效日期',
PriceOfTax INT COMMENT '单价是否含税',
Remark VARCHAR(200) COMMENT '备注',
OutAddress VARCHAR(200) COMMENT '送货地址',
SalesName VARCHAR(20) COMMENT '采购人员',
DepartID INT NOT NULL COMMENT '请购部门',
Maker VARCHAR(20) COMMENT '制单人员',
Permitter VARCHAR(20) COMMENT '复核人员',
Audit INT COMMENT '审核状态',
column1 VARCHAR(50) COMMENT 'column1',
Column2 VARCHAR(50) COMMENT 'column2',
Column3 VARCHAR(50) COMMENT 'column3'
)COMMENT='采购询价表' CHARSET=utf8;
 
##采购询价明细表
DROP TABLE IF EXISTS `purchaseinquirydetails`;
CREATE TABLE purchaseinquirydetails(
SerNO INT AUTO_INCREMENT COMMENT '栏号' PRIMARY KEY,
ProdID VARCHAR(10) NOT NULL COMMENT '物料编号',
ProdName VARCHAR(30) COMMENT '物料名称',
ProdSize VARCHAR(30) COMMENT '规格型号',
SUnitID INT COMMENT '单位名称',
sQuantity INT COMMENT '数量',
OldPrice DOUBLE COMMENT '折扣前单价',
Discount DOUBLE COMMENT '折数',
sPrice DOUBLE COMMENT '单价',
Amount DOUBLE COMMENT '金额',
TaxRate DOUBLE COMMENT '税率',
TaxAmt DOUBLE  COMMENT '税额',
VFTotal DOUBLE NOT NULL COMMENT '含税金额',
IsGift INT COMMENT '是否赠品',
TranType VARCHAR(20) COMMENT '来源单别',
FromNo VARCHAR(20) COMMENT '来源单号',
ItemRemark VARCHAR(50) COMMENT '分录备注',
Remark VARCHAR(200) COMMENT '备注'
)COMMENT='采购询价明细表' CHARSET=utf8;

##采购订单表
DROP TABLE IF EXISTS `purchaseorder`;
CREATE TABLE purchaseorder(
BillNo VARCHAR(10) COMMENT '单据号码' PRIMARY KEY,
BillDate DATE NOT NULL COMMENT '单据日期',
CurrID INT NOT NULL COMMENT '币别',
ExchRate DOUBLE COMMENT '汇率',
CustomerID VARCHAR(20) NOT NULL COMMENT '供应商',
AddressID VARCHAR(50) COMMENT '供应商地址',
BillStyleID INT COMMENT '采购订单类型',
PriceOfTax INT COMMENT '单价是否含税',
BillStatus INT COMMENT '单况',
OutAddress VARCHAR(200) COMMENT '送货地址',
SalesName VARCHAR(20) NOT NULL COMMENT '采购人员',
DepartID INT NOT NULL COMMENT '请购部门',
Maker VARCHAR(20) COMMENT '制单人员',
Permitter VARCHAR(20) COMMENT '复核人员',
PojectName VARCHAR(20) COMMENT '所属项目',
Audit INT COMMENT '审核状态',
column1 VARCHAR(50) COMMENT 'column1',
Column2 VARCHAR(50) COMMENT 'column2',
Column3 VARCHAR(50) COMMENT 'column3'
)COMMENT='采购订单表' CHARSET=utf8;

##采购订单明细表
DROP TABLE IF EXISTS `purchaseorderdetails`;
CREATE TABLE purchaseorderdetails(
LineNo INT AUTO_INCREMENT COMMENT '行号' PRIMARY KEY,
ProdID VARCHAR(10) NOT NULL COMMENT '物料编号',
ProdName VARCHAR(30) COMMENT '物料名称',
ProdSize VARCHAR(30) COMMENT '规格型号',
SUnitID INT COMMENT '单位名称',
sQuantity INT COMMENT '数量',
OldPrice DOUBLE COMMENT '折扣前单价',
Discount DOUBLE COMMENT '折数',
sPrice DOUBLE COMMENT '单价',
Amount DOUBLE COMMENT '金额',
TaxRate DOUBLE COMMENT '税率',
TaxAmt DOUBLE  COMMENT '税额',
VFTotal DOUBLE NOT NULL COMMENT '含税金额',
PreInDate DATE NOT NULL COMMENT '预入库日',
QtyRemain INT COMMENT '未入库量',
IsGift INT COMMENT '是否赠品',
TranType VARCHAR(20) COMMENT '来源单别',
FromNo VARCHAR(20) COMMENT '来源单号',
ItemRemark VARCHAR(50) COMMENT '分录备注',
Remark VARCHAR(200) COMMENT '备注'
)COMMENT='采购订单明细表' CHARSET=utf8;

##采购入库表
DROP TABLE IF EXISTS `tpurchasereceipt`;
CREATE TABLE `tpurchasereceipt` (
  `BillNo` VARCHAR(10) DEFAULT NULL COMMENT '单据号码',
  `BillDate` DATE DEFAULT NULL COMMENT '单据日期',
  `CurrID` INT(11) DEFAULT NULL COMMENT '币别',
  `ExchRate` DOUBLE DEFAULT NULL COMMENT '汇率',
  `HasForeignTrade` VARCHAR(10) DEFAULT NULL COMMENT '国外贸易',
  `CustID` INT(11) DEFAULT NULL COMMENT '供应商',
  `AddressID` VARCHAR(50) DEFAULT NULL COMMENT '供应商地址',
  `SaleClassID` INT(11) DEFAULT NULL COMMENT '采购入库类型',
  `PriceOfTax` INT(11) DEFAULT NULL COMMENT '单价是否含税',
  `WareID` INT(11) DEFAULT NULL COMMENT '仓库id',
  `VoucherNO` VARCHAR(20) DEFAULT NULL COMMENT '凭证编号',
  `SalesName` VARCHAR(20) DEFAULT NULL COMMENT '采购人员',
  `DepartID` INT(11) DEFAULT NULL COMMENT '所属部门',
  `Maker` VARCHAR(20) DEFAULT NULL COMMENT '制单人员',
  `Permitter` VARCHAR(20) DEFAULT NULL COMMENT '复核人员',
  `ProjectID` INT(11) DEFAULT NULL COMMENT '所属项目',
  `Remark` VARCHAR(200) DEFAULT NULL COMMENT '备注',
  `Audit` INT(11) DEFAULT NULL COMMENT '审核状态'
) COMMENT='采购入库表' CHARSET=utf8;

##采购入库明细表
DROP TABLE IF EXISTS `tpurchasereceiptdetails`;
CREATE TABLE `tpurchasereceiptdetails` (
  `LineNo` INT(11) DEFAULT NULL COMMENT '自增,行号',
  `ProdID` INT(11) DEFAULT NULL COMMENT '物料编号，来源物料主文件',
  `ProdName` VARCHAR(30) DEFAULT NULL COMMENT '不可编辑	物料名称，来源物料主文件',
  `ProdSize` VARCHAR(20) DEFAULT NULL COMMENT '不可编辑	规格型号，来源物料主文件',
  `SUnitID` VARCHAR(10) DEFAULT NULL COMMENT '不可编辑	单位名称，来源物料主文件',
  `sQuantity` INT(11) DEFAULT NULL COMMENT '默认为0	数量,要有小兰标签，但如果为0，不可保存',
  `OldPrice` DOUBLE DEFAULT NULL COMMENT '标准进价	折扣前单价',
  `Discount` DOUBLE DEFAULT NULL COMMENT '折数（100%），来源物料主文件',
  `sPrice` DOUBLE DEFAULT NULL COMMENT '单价',
  `Amount` DOUBLE DEFAULT NULL COMMENT '数量*未含税单价后的总金额	金额',
  `TaxRate` DOUBLE DEFAULT NULL COMMENT '17%	税率（100%）',
  `TaxAmt` DOUBLE DEFAULT NULL COMMENT '由金额交税后的钱	税额',
  `VFTotal` DOUBLE DEFAULT NULL COMMENT '包含税额的金额	含税金额',
  `HaveBatch` VARCHAR(20) DEFAULT NULL COMMENT '批号',
  `IsGift` INT(11) DEFAULT NULL COMMENT '默认为0，否0，是1,是否赠品',
  `ItemRemark` VARCHAR(50) DEFAULT NULL COMMENT '分录备注',
  `FromNO` VARCHAR(20) DEFAULT NULL COMMENT '来源单号',
  `TranType` VARCHAR(20) DEFAULT NULL COMMENT '来源单别',
  `MLAppFare` DOUBLE DEFAULT NULL COMMENT '分摊费用'
) COMMENT='采购入库明细表' CHARSET=utf8;

##采购退货表
DROP TABLE IF EXISTS `tpurchasereturn`;
CREATE TABLE `tpurchasereturn` (
  `BillNo` VARCHAR(10) DEFAULT NULL COMMENT '单据号码',
  `BillDate` DATE DEFAULT NULL COMMENT '单据日期',
  `CurrID` INT(11) DEFAULT NULL COMMENT '币别',
  `ExchRate` DOUBLE DEFAULT NULL COMMENT '汇率',
  `HasForeignTrade` VARCHAR(10) DEFAULT NULL COMMENT '国外贸易',
  `CustID` INT(11) DEFAULT NULL COMMENT '供应商',
  `AddressID` VARCHAR(50) DEFAULT NULL COMMENT '供应商地址',
  `PriceOfTax` INT(11) DEFAULT NULL COMMENT '单价是否含税',
  `WareID` INT(11) DEFAULT NULL COMMENT '仓库id',
  `ISDeduct` INT(11) DEFAULT NULL COMMENT '是0，否1	重新入库',
  `VoucherNO` VARCHAR(20) DEFAULT NULL COMMENT '凭证编号',
  `SalesName` VARCHAR(20) DEFAULT NULL COMMENT '采购人员',
  `DepartID` INT(11) DEFAULT NULL COMMENT '所属部门',
  `Maker` VARCHAR(20) DEFAULT NULL COMMENT '制单人员',
  `Permitter` VARCHAR(20) DEFAULT NULL COMMENT '复核人员',
  `ProjectID` INT(11) DEFAULT NULL COMMENT '所属项目',
  `Remark` VARCHAR(200) DEFAULT NULL COMMENT '备注',
  `Audit` INT(11) DEFAULT NULL COMMENT '审核状态'
) COMMENT='采购退货表' CHARSET=utf8;

##采购退货明细表
DROP TABLE IF EXISTS `tpurchasereturndetails`;
CREATE TABLE `tpurchasereturndetails` (
  `LineNo` INT(11) DEFAULT NULL COMMENT '自增,行号',
  `BillNo` VARCHAR(10) DEFAULT NULL COMMENT '采购退货单号',
  `ProdID` INT(11) DEFAULT NULL COMMENT '物料编号，来源物料主文件',
  `ProdName` VARCHAR(30) DEFAULT NULL COMMENT '不可编辑	物料名称，来源物料主文件',
  `ProdSize` VARCHAR(20) DEFAULT NULL COMMENT '不可编辑	规格型号，来源物料主文件',
  `SUnitID` VARCHAR(10) DEFAULT NULL COMMENT '不可编辑	单位名称，来源物料主文件',
  `sQuantity` INT(11) DEFAULT NULL COMMENT '默认为0	数量,要有小兰标签，但如果为0，不可保存',
  `OldPrice` DOUBLE DEFAULT NULL COMMENT '标准进价	折扣前单价',
  `Discount` DOUBLE DEFAULT NULL COMMENT '折数（100%），来源物料主文件',
  `sPrice` DOUBLE DEFAULT NULL COMMENT '单价',
  `Amount` DOUBLE DEFAULT NULL COMMENT '数量*未含税单价后的总金额	金额',
  `TaxRate` DOUBLE DEFAULT NULL COMMENT '17%	税率（100%）',
  `TaxAmt` DOUBLE DEFAULT NULL COMMENT '由金额交税后的钱	税额',
  `VFTotal` DOUBLE DEFAULT NULL COMMENT '包含税额的金额	含税金额',
  `HaveBatch` VARCHAR(20) DEFAULT NULL COMMENT '批号',
  `IsGift` INT(11) DEFAULT NULL COMMENT '默认为0，否0，是1,是否赠品',
  `ItemRemark` VARCHAR(50) DEFAULT NULL COMMENT '分录备注',
  `FromNO` VARCHAR(20) DEFAULT NULL COMMENT '来源单号',
  `TranType` VARCHAR(20) DEFAULT NULL COMMENT '来源单别'
) COMMENT='采购退货明细表' CHARSET=utf8;

##分摊主表
DROP TABLE IF EXISTS `procurementshare`;
CREATE TABLE procurementshare(
PSId VARCHAR(30) PRIMARY KEY,
CreateDate DATE ,
MlAmount DOUBLE,
AssignStyle VARCHAR(30),
VoucherNO VARCHAR(30),
MakerSign VARCHAR(30),
PermitterSign VARCHAR(30),
STATUS VARCHAR(30),
Remark VARCHAR(30),
Column1 VARCHAR(30)	,
Audit INT 
)COMMENT='分摊主表' CHARSET=utf8;

##分摊费用表
DROP TABLE IF EXISTS `procurementshareprice`;
CREATE TABLE procurementshareprice(
PSID VARCHAR(30),
PSPId VARCHAR(30) ,
FeeClassID  VARCHAR(30),
FareClassName VARCHAR(30),
CurrID VARCHAR(30),
Amount DOUBLE,
ExchRate DOUBLE,
MLAmount DOUBLE,
Remarks VARCHAR(30),
COLUMN1 VARCHAR(30),
PRIMARY KEY(PSID,PSPId)
)COMMENT='分摊费用表' CHARSET=utf8;

##分摊物料表
DROP TABLE IF EXISTS `procurementsharedetails`;
CREATE TABLE procurementsharedetails(
PSId VARCHAR(30),
PSDId VARCHAR(30),
PSPId VARCHAR(30),
FromNO VARCHAR(30),
ProdId VARCHAR(30),
ProdName VARCHAR(30),
ProdSize VARCHAR(30),
VAAmount DOUBLE,
VQuantity INT,
Sunit VARCHAR(30),
weight DOUBLE,
MLAmount DOUBLE,
COLUMN1 VARCHAR(30),
COLUMN2 VARCHAR(30),
PRIMARY KEY(psId,Psdid)
)COMMENT='分摊物料表' CHARSET=utf8;

##应付款明细表
DROP TABLE IF EXISTS `taccountPayable`;
CREATE TABLE taccountPayable(
id INT PRIMARY KEY AUTO_INCREMENT,
billstype VARCHAR(20),
billsno VARCHAR(20),
`date` DATE,
sid VARCHAR(20),
payment DOUBLE,
balance DOUBLE,
state INT
)COMMENT='应付款明细表' CHARSET=utf8;

##预付款主表
DROP TABLE IF EXISTS `tprepay`;
CREATE TABLE tprepay(
id	VARCHAR(20) PRIMARY KEY,			
`date`	DATE,		
sid	VARCHAR(20),				
paymentmethod1	VARCHAR(20),					
paymentamout1	DOUBLE,				
paymentmethod2	VARCHAR(20),				
paymentamout2	DOUBLE,			
currencyID	VARCHAR(10),					
discount	DOUBLE,			
enddate	DATE,			
exchangeRate	DOUBLE,					
vouchercode	VARCHAR(20),					
departID	VARCHAR(10),					
project	VARCHAR(20),			
vouchingman	VARCHAR(20),					
auditman	VARCHAR(20),					
remark	VARCHAR(200),			
custom1	VARCHAR(200),				
custom2	VARCHAR(200),				
auditstate	INT,					
audit	INT
)COMMENT='预付款主表' CHARSET=utf8;

##预付款明细表
DROP TABLE IF EXISTS `tprepaydetail`;
CREATE TABLE tprepaydetail(
id	INT PRIMARY KEY AUTO_INCREMENT,
pid	VARCHAR(20),
prepay	DOUBLE,
sourcetype	VARCHAR(20),
sourceno	VARCHAR(20),
balance	DOUBLE,
remark	VARCHAR(200),
state	INT
)COMMENT='预付款明细表' CHARSET=utf8;

##付款主表
DROP TABLE IF EXISTS `tpaymentdetail`;
CREATE TABLE tpaymentdetail(
id	VARCHAR(20) PRIMARY KEY,			
`date`	DATE,		
sid	VARCHAR(20),					
paymentmethod1	VARCHAR(20),					
paymentamout1	DOUBLE,				
paymentmethod2	VARCHAR(20),				
paymentamout2	DOUBLE,			
currencyID	VARCHAR(10),					
discount	DOUBLE,			
enddate	DATE,			
exchangeRate	DOUBLE,					
vouchercode	VARCHAR(20),					
departID	VARCHAR(10),					
project	VARCHAR(20),			
vouchingman	VARCHAR(20),					
auditman	VARCHAR(20),					
remark	VARCHAR(200),			
custom1	VARCHAR(200),				
custom2	VARCHAR(200),				
auditstate	INT,					
audit	INT
)COMMENT='付款主表' CHARSET=utf8;

##付款明细表
DROP TABLE IF EXISTS `tpaymentdetail`;
CREATE TABLE tpaymentdetail(
id	INT PRIMARY KEY,
pid	VARCHAR(20),
sourcetype	VARCHAR(20),
sourceno	VARCHAR(20),
sourcedate	DATE,
invoicenumber	VARCHAR(20),
sid	VARCHAR(20),
sname	VARCHAR(30),
departID	VARCHAR(10),
departName	VARCHAR(20),
buyer	VARCHAR(20),
project	VARCHAR(20),
currencyID	VARCHAR(10),
exchangeRate	DOUBLE,
payment	DOUBLE,
balance	DOUBLE,
rebate	DOUBLE,
money	DOUBLE,
chargeAgainst	DOUBLE,
state	INT
)COMMENT='付款明细表' CHARSET=utf8;

##付款取用预付表
DROP TABLE IF EXISTS `tpaymentprepay`;
CREATE TABLE tpaymentprepay(
id	INT PRIMARY KEY AUTO_INCREMENT,
paymentid	VARCHAR(20),
prepayid	VARCHAR(20),
prepaydid	INT,
takenmoney	DOUBLE,
state	INT,
audit	INT
)COMMENT='付款取用预付表' CHARSET=utf8;

/*======================================================================*/


