package com.nowcoder.community.entity;

/**
 * @author Ma Tengfei
 * @create 2022-04-25 22:45
 *
 * 封装分页相关的信息
 */
public class Page {

    //当前页码
    private int current = 1;

    //显示上限
    private int limit = 10;

    //数据总数（用于计算总页数）
    private int rows;

    //查询路径（用于复用分页链接）
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行
     */
    public int getOffset() {
        return (current - 1) * limit;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotal() {
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /**
     * 获取页码导航条起始页
     * @return
     */
    public int getFrom() {
        int from = current - 2;
        if (from > getTotal() - 4) {
            from = getTotal() - 4;
        }
        if (from < 1) {
            from = 1;
        }
        return from;
    }

    /**
     * 获取页码导航条终止页
     * @return
     */
    public int getTo() {
        int total = getTotal();
        int to = current + 2;
        if (to > total) {
            to = total;
        } else if (to < 5) {
            to = 5;
        }
        return to;
    }
}
