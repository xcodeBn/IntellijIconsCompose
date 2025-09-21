package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testignored: ImageVector
    get() {
        if (_Testignored != null) return _Testignored!!

        _Testignored = ImageVector.Builder(
            name = "Testignored",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 12f)
                curveTo(6.53f, 12.05f, 7.24f, 12.25f, 8.00f, 12.25f)
                curveTo(10.35f, 12.25f, 12.25f, 10.35f, 12.25f, 8.00f)
                curveTo(12.25f, 7.24f, 12.05f, 6.53f, 11.71f, 5.92f)
                lineTo(6f, 12f)
                close()
                moveTo(4f, 10f)
                lineTo(10f, 4f)
                curveTo(9.47f, 3.95f, 8.76f, 3.75f, 8.00f, 3.75f)
                curveTo(5.65f, 3.75f, 3.75f, 5.65f, 3.75f, 8.00f)
                curveTo(3.75f, 8.76f, 3.95f, 9.47f, 4.29f, 10.08f)
                close()
                moveTo(8f, 14f)
                curveTo(4.41f, 14.50f, 1.50f, 11.59f, 1.50f, 8.00f)
                curveTo(1.50f, 4.41f, 4.41f, 1.50f, 8.00f, 1.50f)
                curveTo(11.59f, 1.50f, 14.50f, 4.41f, 14.50f, 8.00f)
                curveTo(14.50f, 11.59f, 11.59f, 14.50f, 8.00f, 14.50f)
                close()
            }
        }.build()

        return _Testignored!!
    }

private var _Testignored: ImageVector? = null

