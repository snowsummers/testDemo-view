/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : testdemodb

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2023-07-19 20:47:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for emp_user
-- ----------------------------
DROP TABLE IF EXISTS `emp_user`;
CREATE TABLE `emp_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `age` int(100) DEFAULT NULL COMMENT '年龄',
  `dept_name` varchar(255) DEFAULT NULL COMMENT '部门名称',
  `emp_degree_name` varchar(10) DEFAULT NULL COMMENT '学历',
  `login_account` varchar(255) DEFAULT NULL,
  `passward` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp_user
-- ----------------------------
INSERT INTO `emp_user` VALUES ('37', '张一', '男', '25', '业务部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('38', '张二', '女', '26', '人事部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('39', '张三', '男', '27', '后勤部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('40', '张四', '女', '28', '人事部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('41', '张五', '男', '29', '后勤部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('42', '张六', '女', '29', '后勤部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('43', '张七', '男', '33', '业务部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('44', '张八', '男', '32', '业务部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('45', '张九', '女', '33', '业务部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('46', '李一', '女', '45', '业务部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('47', '李二', '女', '19', '人事部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('48', '李三', '男', '28', '业务部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('49', '李四', '女', '46', '后勤部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('50', '李五', '男', '58', '业务部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('51', '李六', '女', '22', '人事部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('52', '李七', '男', '26', '后勤部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('53', '李八', '男', '25', '人事部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('54', '李九', '女', '29', '后勤部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('55', '王一', '男', '45', '后勤部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('56', '王二', '女', '21', '业务部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('57', '王三', '男', '21', '业务部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('58', '王四', '男', '23', '业务部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('59', '王五', '女', '33', '业务部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('60', '王六', '男', '45', '人事部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('61', '王七', '男', '35', '业务部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('62', '王八', '男', '41', '后勤部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('63', '王九', '女', '25', '业务部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('64', '赵一', '男', '26', '人事部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('65', '赵二', '男', '20', '后勤部', '本科', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('66', '赵三', '女', '21', '人事部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('67', '赵四', '男', '19', '后勤部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('68', '赵五', '女', '35', '后勤部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('69', '赵六', '男', '24', '业务部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('70', '赵七', '男', '29', '业务部', '大专', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('71', '赵八', '女', '33', '业务部', '研究生', 'admin', 'admin');
INSERT INTO `emp_user` VALUES ('72', '赵九', '男', '45', '业务部', '本科', 'admin', 'admin');
