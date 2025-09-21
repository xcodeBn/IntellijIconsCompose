package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbPrimitive: ImageVector
    get() {
        if (_DbPrimitive != null) return _DbPrimitive!!

        _DbPrimitive = ImageVector.Builder(
            name = "DbPrimitive",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(11f, 11f)
                lineTo(11f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 6f)
                lineTo(11f, 5f)
                lineTo(12f, 5f)
                lineTo(12f, 11f)
                lineTo(11f, 11f)
                close()
                moveTo(6f, 11f)
                curveTo(4.87f, 11.10f, 3.89f, 9.84f, 3.89f, 8.22f)
                lineTo(4f, 8f)
                curveTo(3.89f, 6.58f, 4.90f, 5.30f, 6.39f, 5.30f)
                curveTo(7.87f, 5.30f, 8.87f, 6.56f, 8.87f, 8.18f)
                lineTo(9f, 8f)
                curveTo(8.87f, 9.82f, 7.87f, 11.10f, 6.37f, 11.10f)
                close()
                moveTo(6f, 10f)
                curveTo(7.14f, 9.98f, 7.61f, 9.23f, 7.61f, 8.22f)
                lineTo(8f, 8f)
                curveTo(7.61f, 7.18f, 7.11f, 6.42f, 6.38f, 6.42f)
                curveTo(5.64f, 6.42f, 5.16f, 7.16f, 5.16f, 8.18f)
                lineTo(5f, 8f)
                curveTo(5.16f, 9.22f, 5.65f, 9.98f, 6.39f, 9.98f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(11f, 11f)
                    lineTo(11f, 7f)
                    lineTo(10f, 7f)
                    lineTo(10f, 6f)
                    lineTo(11f, 5f)
                    lineTo(12f, 5f)
                    lineTo(12f, 11f)
                    lineTo(11f, 11f)
                    close()
                    moveTo(6f, 11f)
                    curveTo(4.87f, 11.10f, 3.89f, 9.84f, 3.89f, 8.22f)
                    lineTo(4f, 8f)
                    curveTo(3.89f, 6.58f, 4.90f, 5.30f, 6.39f, 5.30f)
                    curveTo(7.87f, 5.30f, 8.87f, 6.56f, 8.87f, 8.18f)
                    lineTo(9f, 8f)
                    curveTo(8.87f, 9.82f, 7.87f, 11.10f, 6.37f, 11.10f)
                    close()
                    moveTo(6f, 10f)
                    curveTo(7.14f, 9.98f, 7.61f, 9.23f, 7.61f, 8.22f)
                    lineTo(8f, 8f)
                    curveTo(7.61f, 7.18f, 7.11f, 6.42f, 6.38f, 6.42f)
                    curveTo(5.64f, 6.42f, 5.16f, 7.16f, 5.16f, 8.18f)
                    lineTo(5f, 8f)
                    curveTo(5.16f, 9.22f, 5.65f, 9.98f, 6.39f, 9.98f)
                    close()
                }
            }
        }.build()

        return _DbPrimitive!!
    }

private var _DbPrimitive: ImageVector? = null

