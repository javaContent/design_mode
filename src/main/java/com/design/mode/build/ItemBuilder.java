package com.design.mode.build;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 3:27 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class ItemBuilder {

    protected Item item = new Item();

    public ItemBuilder codeBuilder() {
        item.setCode("code");
        return this;
    }

    public ItemBuilder urlBuilder() {
        item.setUrl("url");
        return this;
    }

    public Item builder() {
        return this.item;
    }

}
