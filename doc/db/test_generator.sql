/*
 Navicat Premium Data Transfer

 Source Server         : 测试数据库
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Schema         : test_generator

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 19/07/2022 09:58:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_config
-- ----------------------------
DROP TABLE IF EXISTS `test_config`;
CREATE TABLE `test_config`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关键字',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '配置' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_expression
-- ----------------------------
DROP TABLE IF EXISTS `test_expression`;
CREATE TABLE `test_expression`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `result` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '结果',
  `index` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '索引',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '表达式' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_formula
-- ----------------------------
DROP TABLE IF EXISTS `test_formula`;
CREATE TABLE `test_formula`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关键词',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代码',
  `expression` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '表达式',
  `type` int(0) NULL DEFAULT NULL COMMENT '算法类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '算法' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_option
-- ----------------------------
DROP TABLE IF EXISTS `test_option`;
CREATE TABLE `test_option`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `correct` bit(1) NULL DEFAULT NULL COMMENT '是否正确',
  `expression` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '表达式',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '可选项参数' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test_option
-- ----------------------------
INSERT INTO `test_option` VALUES (1, b'0', 'test');
INSERT INTO `test_option` VALUES (2, b'0', 'test');

-- ----------------------------
-- Table structure for test_option_record
-- ----------------------------
DROP TABLE IF EXISTS `test_option_record`;
CREATE TABLE `test_option_record`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `option_id` bigint(0) NULL DEFAULT NULL COMMENT '选项ID',
  `record_id` bigint(0) NULL DEFAULT NULL COMMENT '记录ID',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '可选项记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_parameter
-- ----------------------------
DROP TABLE IF EXISTS `test_parameter`;
CREATE TABLE `test_parameter`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关键字',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代码',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '参数类型',
  `globle` bit(1) NULL DEFAULT NULL COMMENT '是否全局',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '参数' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_question_record
-- ----------------------------
DROP TABLE IF EXISTS `test_question_record`;
CREATE TABLE `test_question_record`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '记录主键',
  `subject_id` int(0) NULL DEFAULT NULL COMMENT '题目主键',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代码',
  `difficulty` int(0) NULL DEFAULT NULL COMMENT '难度',
  `classify` int(0) NULL DEFAULT NULL COMMENT '分类',
  `varibles` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '值列表',
  `answer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '答案',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '题目问题记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_result_record
-- ----------------------------
DROP TABLE IF EXISTS `test_result_record`;
CREATE TABLE `test_result_record`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `subject_id` bigint(0) NULL DEFAULT NULL COMMENT '题目ID',
  `result_id` bigint(0) NULL DEFAULT NULL COMMENT '结果ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '答题记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_subject
-- ----------------------------
DROP TABLE IF EXISTS `test_subject`;
CREATE TABLE `test_subject`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代码',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `format` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '格式',
  `difficulty` int(0) NULL DEFAULT NULL COMMENT '难度',
  `classify` int(0) NULL DEFAULT NULL COMMENT '分类',
  `version` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '版本',
  `finger_print` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件指纹',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '题目' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_subject_record
-- ----------------------------
DROP TABLE IF EXISTS `test_subject_record`;
CREATE TABLE `test_subject_record`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '记录主键',
  `subject_id` int(0) NULL DEFAULT NULL COMMENT '题目主键',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `format` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '格式',
  `difficulty` int(0) NULL DEFAULT NULL COMMENT '难度',
  `classify` int(0) NULL DEFAULT NULL COMMENT '分类',
  `varibles` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '值列表',
  `answer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '答案',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '题目记录' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
