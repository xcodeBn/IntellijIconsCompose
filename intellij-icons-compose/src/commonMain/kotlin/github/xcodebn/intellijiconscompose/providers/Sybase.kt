package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sybase: ImageVector
    get() {
        if (_Sybase != null) return _Sybase!!

        _Sybase = ImageVector.Builder(
            name = "Sybase",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(4f, 15f)
                lineTo(2f, 14f)
                curveTo(0.06f, 11.59f, 0.25f, 7.30f, 1.10f, 5.38f)
                curveTo(3.76f, -0.66f, 12.93f, -1.39f, 13.53f, 4.86f)
                curveTo(13.63f, 5.88f, 13.33f, 6.61f, 12.49f, 7.45f)
                curveTo(11.66f, 8.28f, 10.55f, 8.28f, 9.90f, 7.97f)
                curveTo(8.87f, 7.46f, 8.90f, 5.90f, 10.27f, 5.70f)
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(4f, 15f)
                    lineTo(2f, 14f)
                    curveTo(0.06f, 11.59f, 0.25f, 7.30f, 1.10f, 5.38f)
                    curveTo(3.76f, -0.66f, 12.93f, -1.39f, 13.53f, 4.86f)
                    curveTo(13.63f, 5.88f, 13.33f, 6.61f, 12.49f, 7.45f)
                    curveTo(11.66f, 8.28f, 10.55f, 8.28f, 9.90f, 7.97f)
                    curveTo(8.87f, 7.46f, 8.90f, 5.90f, 10.27f, 5.70f)
                }
            }
        }.build()

        return _Sybase!!
    }

private var _Sybase: ImageVector? = null

