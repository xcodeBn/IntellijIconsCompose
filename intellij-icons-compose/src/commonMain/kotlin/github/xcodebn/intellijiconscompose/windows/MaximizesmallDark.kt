package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaximizesmallDark: ImageVector
    get() {
        if (_MaximizesmallDark != null) return _MaximizesmallDark!!

        _MaximizesmallDark = ImageVector.Builder(
            name = "MaximizesmallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 4f)
                lineTo(12f, 4f)
                lineTo(12f, 12f)
                lineTo(4f, 12f)
                lineTo(4f, 4f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 5f)
                lineTo(5f, 5f)
                close()
            }
        }.build()

        return _MaximizesmallDark!!
    }

private var _MaximizesmallDark: ImageVector? = null

