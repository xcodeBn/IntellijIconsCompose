package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tarantool: ImageVector
    get() {
        if (_Tarantool != null) return _Tarantool!!

        _Tarantool = ImageVector.Builder(
            name = "Tarantool",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(8f, 10f)
                curveTo(6.58f, 8.83f, 6.58f, 7.21f, 7.58f, 6.21f)
                lineTo(9f, 5f)
                curveTo(10.11f, 3.68f, 11.73f, 3.68f, 12.72f, 4.68f)
                lineTo(14f, 6f)
                curveTo(15.25f, 7.21f, 15.25f, 8.83f, 14.25f, 9.82f)
                lineTo(13f, 11f)
                curveTo(11.73f, 12.35f, 10.11f, 12.35f, 9.11f, 11.35f)
                lineTo(8f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(2f, 10f)
                curveTo(0.69f, 8.99f, 0.69f, 7.00f, 1.92f, 5.77f)
                lineTo(4f, 4f)
                curveTo(5.13f, 2.56f, 7.12f, 2.56f, 8.35f, 3.79f)
                lineTo(10f, 6f)
                curveTo(11.56f, 7.00f, 11.56f, 8.99f, 10.33f, 10.22f)
                lineTo(8f, 12f)
                curveTo(7.12f, 13.43f, 5.13f, 13.43f, 3.90f, 12.20f)
                lineTo(2f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF0D2A))
            ) {
                moveTo(9f, 5f)
                lineTo(10f, 6f)
                curveTo(11.56f, 7.00f, 11.56f, 9.00f, 10.33f, 10.23f)
                lineTo(9f, 11f)
                curveTo(9.14f, 11.39f, 9.13f, 11.37f, 9.11f, 11.35f)
                lineTo(8f, 10f)
                curveTo(6.58f, 8.83f, 6.58f, 7.21f, 7.58f, 6.21f)
                lineTo(9f, 5f)
                curveTo(9.13f, 4.66f, 9.16f, 4.64f, 9.18f, 4.62f)
                close()
            }
        }.build()

        return _Tarantool!!
    }

private var _Tarantool: ImageVector? = null

