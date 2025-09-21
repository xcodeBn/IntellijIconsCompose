package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowsplitcentervDark: ImageVector
    get() {
        if (_ArrowsplitcentervDark != null) return _ArrowsplitcentervDark!!

        _ArrowsplitcentervDark = ImageVector.Builder(
            name = "ArrowsplitcentervDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 4f)
                lineTo(10f, 7f)
                lineTo(6f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 9f)
                lineTo(10f, 12f)
                lineTo(6f, 12f)
                close()
            }
        }.build()

        return _ArrowsplitcentervDark!!
    }

private var _ArrowsplitcentervDark: ImageVector? = null

