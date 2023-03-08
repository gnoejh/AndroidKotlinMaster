package com.example.chatgptrecyclerview;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"},
        d2 = {"Lcom/example/chatgptrecyclerview/Item;", "", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ChatGPT_RecyclerView.app.main"}
)
public final class Item {
    @NotNull
    private final String text;

    @NotNull
    public final String getText() {
        return this.text;
    }

    public Item(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        super();
        this.text = text;
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final Item copy(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new Item(text);
    }

    // $FF: synthetic method
    public static Item copy$default(Item var0, String var1, int var2, Object var3) {
        if ((var2 & 1) != 0) {
            var1 = var0.text;
        }

        return var0.copy(var1);
    }

    @NotNull
    public String toString() {
        return "Item(text=" + this.text + ")";
    }

    public int hashCode() {
        String var10000 = this.text;
        return var10000 != null ? var10000.hashCode() : 0;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Item) {
                Item var2 = (Item)var1;
                if (Intrinsics.areEqual(this.text, var2.text)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
