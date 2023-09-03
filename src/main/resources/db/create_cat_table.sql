create table cat
(
    id           bigserial PRIMARY KEY,
    cat_name     varchar(255) not null,
    cat_color    varchar(50),
    cat_age      integer,
    cat_owner_id integer
);

create unique index cat_id_uindex
    on cat (id);