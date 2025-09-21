package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SplitDark: ImageVector
    get() {
        if (_SplitDark != null) return _SplitDark!!

        _SplitDark = ImageVector.Builder(
            name = "SplitDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 2f)
                lineTo(6f, 2f)
                lineTo(2f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 2f)
                lineTo(14f, 2f)
                lineTo(10f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 8f)
                lineTo(8f, 6f)
                lineTo(12f, 10f)
                lineTo(10f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 10f)
                lineTo(5f, 5f)
                lineTo(5f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 6f)
                lineTo(2f, 11f)
                close()
            }
        }.build()

        return _SplitDark!!
    }

private var _SplitDark: ImageVector? = null

