package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testunknown: ImageVector
    get() {
        if (_Testunknown != null) return _Testunknown!!

        _Testunknown = ImageVector.Builder(
            name = "Testunknown",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 14f)
                curveTo(11.59f, 14.50f, 14.50f, 11.59f, 14.50f, 8.00f)
                curveTo(14.50f, 4.41f, 11.59f, 1.50f, 8.00f, 1.50f)
                curveTo(4.41f, 1.50f, 1.50f, 4.41f, 1.50f, 8.00f)
                curveTo(1.50f, 11.59f, 4.41f, 14.50f, 8.00f, 14.50f)
                close()
                moveTo(7f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 12f)
                close()
                moveTo(8f, 4f)
                curveTo(6.34f, 3.50f, 5.00f, 4.59f, 5.00f, 6.25f)
                lineTo(6f, 6f)
                curveTo(6.50f, 5.50f, 7.25f, 5.00f, 8.00f, 5.00f)
                curveTo(8.75f, 5.00f, 9.50f, 5.50f, 9.50f, 6.25f)
                curveTo(9.50f, 7.50f, 7.00f, 8.00f, 7.00f, 9.50f)
                lineTo(9f, 10f)
                curveTo(9.00f, 8.00f, 11.00f, 8.00f, 11.00f, 6.25f)
                curveTo(11.00f, 4.59f, 9.66f, 3.50f, 8.00f, 3.50f)
                close()
            }
        }.build()

        return _Testunknown!!
    }

private var _Testunknown: ImageVector? = null

