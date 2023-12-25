/*
Navicat MySQL Data Transfer

Source Server         : 123456
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : books

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2021-12-29 14:52:46
*/

create database books ;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_book
-- ----------------------------
DROP TABLE IF EXISTS `sys_book`;
CREATE TABLE `sys_book` (
  `bookid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bookname` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `publish` varchar(20) DEFAULT NULL,
  `pages` int(10) DEFAULT NULL,
  `price` float(10,2) DEFAULT NULL,
  `categoryid` int(10) DEFAULT NULL,
  PRIMARY KEY (`bookid`),
  KEY `FK_ieh6qsxp6q7oydadktc9oc8t2` (`categoryid`),
  CONSTRAINT `FK_ieh6qsxp6q7oydadktc9oc8t2` FOREIGN KEY (`categoryid`) REFERENCES `sys_category` (`categoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_book
-- ----------------------------
INSERT INTO `sys_book` VALUES ('1', '解忧杂货店', '东野圭吾', '电子工业出版社', '102', '27.30', '9');
INSERT INTO `sys_book` VALUES ('2', '追风筝的人', '卡勒德·胡赛尼', '上海人民出版社', '230', '33.50', '3');
INSERT INTO `sys_book` VALUES ('3', '人间失格', '太宰治', '作家出版社', '150', '17.30', '1');
INSERT INTO `sys_book` VALUES ('4', '这就是二十四节气', '高春香', '电子工业出版社', '220', '59.00', '3');
INSERT INTO `sys_book` VALUES ('5', '白夜行', '东野圭吾', '南海出版公司', '300', '27.30', '4');
INSERT INTO `sys_book` VALUES ('6', '摆渡人', '克莱儿·麦克福尔', '百花洲文艺出版社', '225', '22.80', '1');
INSERT INTO `sys_book` VALUES ('7', '暖暖心绘本', '米拦弗特毕', '湖南少儿出版社', '168', '131.60', '5');
INSERT INTO `sys_book` VALUES ('8', '天才在左疯子在右', '高铭', '北京联合出版公司', '330', '27.50', '6');
INSERT INTO `sys_book` VALUES ('9', '我们仨', '杨绛', '生活.读书.新知三联书店', '89', '17.20', '7');
INSERT INTO `sys_book` VALUES ('10', '活着', '余华', '作家出版社', '100', '100.00', '6');

-- ----------------------------
-- Table structure for sys_category
-- ----------------------------
DROP TABLE IF EXISTS `sys_category`;
CREATE TABLE `sys_category` (
  `categoryid` int(11) NOT NULL AUTO_INCREMENT,
  `categoryname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`categoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_category
-- ----------------------------
INSERT INTO `sys_category` VALUES ('1', '社会');
INSERT INTO `sys_category` VALUES ('2', '情感');
INSERT INTO `sys_category` VALUES ('3', '国学');
INSERT INTO `sys_category` VALUES ('4', '推理');
INSERT INTO `sys_category` VALUES ('5', '绘画');
INSERT INTO `sys_category` VALUES ('6', '心理学');
INSERT INTO `sys_category` VALUES ('7', '传记');
INSERT INTO `sys_category` VALUES ('8', '科技');
INSERT INTO `sys_category` VALUES ('9', '计算机');
INSERT INTO `sys_category` VALUES ('10', '小说');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `userid` varchar(15) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(16) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('admin', '马化腾', '123456')
('myadmin', '王五', '12345');
