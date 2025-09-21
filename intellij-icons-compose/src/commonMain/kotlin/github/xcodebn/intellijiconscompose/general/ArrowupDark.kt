package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowupDark: ImageVector
    get() {
        if (_ArrowupDark != null) return _ArrowupDark!!

        _ArrowupDark = ImageVector.Builder(
            name = "ArrowupDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 5f)
                lineTo(12f, 10f)
                lineTo(4f, 10f)
                close()
            }
        }.build()

        return _ArrowupDark!!
    }

private var _ArrowupDark: ImageVector? = null

