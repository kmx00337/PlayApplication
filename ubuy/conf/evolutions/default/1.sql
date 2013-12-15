# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table products (
  product_id                bigint auto_increment not null,
  image                     VARCHAR(255) not null,
  price                     bigint not null,
  categoly                  VARCHAR(255) DEFAULT NULL,
  brand                     VARCHAR(255) DEFAULT NULL,
  stock                     bigint not null,
  shop_id                   bigint not null,
  constraint pk_products primary key (product_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table products;

SET FOREIGN_KEY_CHECKS=1;

