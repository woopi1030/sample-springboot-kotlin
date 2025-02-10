DROP TABLE IF EXISTS sample;

CREATE TABLE IF NOT EXISTS sample (
    id bigint auto_increment primary key comment 'ID',
    reserved_column_01 varchar(255) null comment 'reserved_column_01',
    reserved_column_02 varchar(255) null comment 'reserved_column_02',
    reserved_column_03 varchar(255) null comment 'reserved_column_03',
    reserved_column_04 varchar(255) null comment 'reserved_column_04',
    reserved_column_05 varchar(255) null comment 'reserved_column_05',
    reserved_column_06 varchar(255) null comment 'reserved_column_06',
    reserved_column_07 varchar(255) null comment 'reserved_column_07',
    reserved_column_08 varchar(255) null comment 'reserved_column_08',
    reserved_column_09 varchar(255) null comment 'reserved_column_09',
    reserved_column_10 varchar(255) null comment 'reserved_column_10',
    status varchar(20) not null default 'active' comment '상태',
    created_by  varchar(20) null comment '생성자',
    created_at datetime not null default current_timestamp comment '생성 시간',
    updated_by varchar(20) null comment '수정자',
    updated_at datetime null comment '수정 시간'
) comment '샘플 테이블' CHARSET=utf8mb4;
