package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FatalerrorReadDark: ImageVector
    get() {
        if (_FatalerrorReadDark != null) return _FatalerrorReadDark!!

        _FatalerrorReadDark = ImageVector.Builder(
            name = "FatalerrorReadDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 14f)
                curveTo(4.69f, 14.00f, 2.00f, 11.31f, 2.00f, 8.00f)
                curveTo(2.00f, 4.69f, 4.69f, 2.00f, 8.00f, 2.00f)
                curveTo(11.31f, 2.00f, 14.00f, 4.69f, 14.00f, 8.00f)
                curveTo(14.00f, 11.31f, 11.31f, 14.00f, 8.00f, 14.00f)
                close()
                moveTo(7f, 4f)
                lineTo(7f, 8f)
                lineTo(9f, 8f)
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

        return _FatalerrorReadDark!!
    }

private var _FatalerrorReadDark: ImageVector? = null

