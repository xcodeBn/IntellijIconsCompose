package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowrightDark: ImageVector
    get() {
        if (_ArrowrightDark != null) return _ArrowrightDark!!

        _ArrowrightDark = ImageVector.Builder(
            name = "ArrowrightDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _ArrowrightDark!!
    }

private var _ArrowrightDark: ImageVector? = null

