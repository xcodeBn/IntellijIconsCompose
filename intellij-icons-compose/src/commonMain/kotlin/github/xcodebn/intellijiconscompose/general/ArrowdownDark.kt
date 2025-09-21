package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowdownDark: ImageVector
    get() {
        if (_ArrowdownDark != null) return _ArrowdownDark!!

        _ArrowdownDark = ImageVector.Builder(
            name = "ArrowdownDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                lineTo(12f, 11f)
                lineTo(4f, 11f)
                close()
            }
        }.build()

        return _ArrowdownDark!!
    }

private var _ArrowdownDark: ImageVector? = null

