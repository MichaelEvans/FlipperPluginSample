import React from 'react';
import {DataTableColumn, createTablePlugin} from 'flipper-plugin';

type Row = {
  id: string;
  event: string;
  timestamp: long;
}

const columns: DataTableColumn<Row>[] = [
  {
    title: "Event Name",
    key: 'event',
  },
  {
    key: 'timestamp',
    width: '20%',
  }
];

const {plugin, Component} = createTablePlugin<Row>({
  columns,
  method: 'newRow',
  key: 'id',
});
export {plugin, Component};