package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BalloonerrorDark: ImageVector
    get() {
        if (_BalloonerrorDark != null) return _BalloonerrorDark!!

        _BalloonerrorDark = ImageVector.Builder(
            name = "BalloonerrorDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 15f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                close()
                moveTo(7f, 4f)
                lineTo(7f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 4f)
                lineTo(7f, 4f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 10f)
                lineTo(7f, 10f)
                close()
            }
        }.build()

        return _BalloonerrorDark!!
    }

private var _BalloonerrorDark: ImageVector? = null

