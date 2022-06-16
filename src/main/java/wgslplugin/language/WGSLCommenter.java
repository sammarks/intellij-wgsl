package wgslplugin.language;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

public class WGSLCommenter implements Commenter {
    @Override
    public @Nullable String getLineCommentPrefix() {
        return "//";
    }

    @Override
    public @Nullable String getBlockCommentPrefix() {
        return "/*";
    }

    @Override
    public @Nullable String getBlockCommentSuffix() {
        return "*/";
    }

    @Override
    public @Nullable String getCommentedBlockCommentPrefix() {
        return "/*";
    }

    @Override
    public @Nullable String getCommentedBlockCommentSuffix() {
        return "*/";
    }
}
