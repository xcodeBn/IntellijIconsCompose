package github.xcodebn.intellijiconscompose.ide.notification

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Noevents: ImageVector
    get() {
        if (_Noevents != null) return _Noevents!!

        _Noevents = ImageVector.Builder(
            name = "Noevents",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 11f)
                curveTo(6.50f, 11.40f, 6.50f, 11.40f, 6.50f, 11.40f)
                curveTo(6.50f, 11.40f, 6.50f, 11.40f, 6.50f, 11.40f)
                lineTo(11f, 11f)
                lineTo(11f, 6f)
                lineTo(11f, 6f)
                curveTo(11.35f, 3.74f, 9.17f, 1.60f, 6.50f, 1.60f)
                curveTo(3.79f, 1.60f, 1.60f, 3.79f, 1.60f, 6.50f)
                curveTo(1.60f, 9.17f, 3.74f, 11.35f, 6.40f, 11.40f)
                lineTo(6f, 11f)
                lineTo(6f, 11f)
                close()
                moveTo(13f, 6f)
                lineTo(13f, 13f)
                lineTo(6f, 13f)
                curveTo(2.91f, 13.00f, 0.00f, 10.09f, 0.00f, 6.50f)
                curveTo(0.00f, 2.91f, 2.91f, 0.00f, 6.50f, 0.00f)
                curveTo(10.09f, 0.00f, 13.00f, 2.91f, 13.00f, 6.50f)
                close()
            }
        }.build()

        return _Noevents!!
    }

private var _Noevents: ImageVector? = null

