package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabalert: ImageVector
    get() {
        if (_Tabalert != null) return _Tabalert!!

        _Tabalert = ImageVector.Builder(
            name = "Tabalert",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF4AF3D))
            ) {
                moveTo(16f, 12f)
                curveTo(16.00f, 14.43f, 14.43f, 16.00f, 12.50f, 16.00f)
                curveTo(10.57f, 16.00f, 9.00f, 14.43f, 9.00f, 12.50f)
                curveTo(9.00f, 10.57f, 10.57f, 9.00f, 12.50f, 9.00f)
                curveTo(14.43f, 9.00f, 16.00f, 10.57f, 16.00f, 12.50f)
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(12f, 15f)
                lineTo(13f, 15f)
                lineTo(15f, 13f)
                lineTo(14f, 12f)
                lineTo(13f, 13f)
                lineTo(13f, 9f)
                curveTo(12.84f, 9.03f, 12.67f, 9.00f, 12.50f, 9.00f)
                curveTo(12.33f, 9.00f, 12.16f, 9.03f, 12.00f, 9.05f)
                lineTo(12f, 13f)
                lineTo(11f, 12f)
                lineTo(10f, 13f)
                lineTo(12f, 15f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFF4AF3D))
                ) {
                    moveTo(16f, 12f)
                    curveTo(16.00f, 14.43f, 14.43f, 16.00f, 12.50f, 16.00f)
                    curveTo(10.57f, 16.00f, 9.00f, 14.43f, 9.00f, 12.50f)
                    curveTo(9.00f, 10.57f, 10.57f, 9.00f, 12.50f, 9.00f)
                    curveTo(14.43f, 9.00f, 16.00f, 10.57f, 16.00f, 12.50f)
                }
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(12f, 15f)
                    lineTo(13f, 15f)
                    lineTo(15f, 13f)
                    lineTo(14f, 12f)
                    lineTo(13f, 13f)
                    lineTo(13f, 9f)
                    curveTo(12.84f, 9.03f, 12.67f, 9.00f, 12.50f, 9.00f)
                    curveTo(12.33f, 9.00f, 12.16f, 9.03f, 12.00f, 9.05f)
                    lineTo(12f, 13f)
                    lineTo(11f, 12f)
                    lineTo(10f, 13f)
                    lineTo(12f, 15f)
                    close()
                }
            }
        }.build()

        return _Tabalert!!
    }

private var _Tabalert: ImageVector? = null

