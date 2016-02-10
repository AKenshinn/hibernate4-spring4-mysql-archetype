
    drop table if exists SAMPLES;

    create table SAMPLES (
        ID bigint not null auto_increment,
        CREATED_DATE date,
        UPDATED_DATE date,
        NAME varchar(255),
        primary key (ID)
    );
