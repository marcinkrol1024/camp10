create table users (
  id bigserial primary key,
  login text not null,
  password text not null
);

create table projects (
  id bigserial primary key,
  name text not null,
  created timestamp not null
);

create table user_project (
  user_id bigint not null references users(id),
  project_id bigint not null references projects(id),
  unique(user_id, project_id)
);

create type task_status as enum (
  'open',
  'in-progress',
  'qa',
  'done'
);

create table tasks (
  id bigserial primary key,
  title text not null,
  created timestamp not null,
  assignee_id bigint references users(id),
  status task_status not null,
  project_id bigint not null references projects(id),
  parent_id bigint references tasks(id)
);