package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lambdabreakpoint: ImageVector
    get() {
        if (_Lambdabreakpoint != null) return _Lambdabreakpoint!!

        _Lambdabreakpoint = ImageVector.Builder(
            name = "Lambdabreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 3f)
                lineTo(11f, 12f)
                lineTo(8f, 12f)
                lineTo(6f, 7f)
                lineTo(4f, 12f)
                lineTo(1f, 12f)
                curveTo(3.60f, 6.56f, 4.80f, 3.76f, 4.80f, 3.60f)
                curveTo(4.80f, 3.33f, 4.63f, 3.18f, 4.17f, 2.71f)
                curveTo(3.95f, 2.47f, 3.60f, 2.40f, 3.13f, 2.40f)
                lineTo(2f, 2f)
                lineTo(2f, 0f)
                lineTo(3f, 0f)
                curveTo(4.34f, 0.00f, 5.04f, 0.34f, 5.52f, 0.72f)
                curveTo(6.08f, 1.17f, 6.52f, 1.82f, 6.82f, 2.71f)
                close()
            }
        }.build()

        return _Lambdabreakpoint!!
    }

private var _Lambdabreakpoint: ImageVector? = null

