package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Aspectj: ImageVector
    get() {
        if (_Aspectj != null) return _Aspectj!!

        _Aspectj = ImageVector.Builder(
            name = "Aspectj",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(3f, 3f)
                lineTo(2f, 1f)
                lineTo(2f, 3f)
                lineTo(3f, 3f)
                close()
                moveTo(2f, 0f)
                lineTo(3f, 0f)
                lineTo(5f, 5f)
                lineTo(4f, 5f)
                lineTo(3f, 4f)
                lineTo(2f, 4f)
                lineTo(1f, 5f)
                lineTo(0f, 5f)
                lineTo(2f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(1f, 4f)
                curveTo(1.62f, 3.84f, 1.84f, 4.00f, 2.29f, 4.00f)
                curveTo(2.81f, 4.00f, 3.00f, 3.59f, 3.00f, 3.30f)
                lineTo(3f, 0f)
                lineTo(4f, 0f)
                lineTo(4f, 4f)
                curveTo(4.00f, 4.32f, 3.33f, 5.00f, 2.45f, 5.00f)
                curveTo(1.63f, 5.00f, 1.15f, 4.76f, 0.80f, 4.32f)
                lineTo(1f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 8f)
                lineTo(13f, 8f)
                lineTo(13f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(1f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 9f)
                lineTo(1f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(3f, 3f)
                    lineTo(2f, 1f)
                    lineTo(2f, 3f)
                    lineTo(3f, 3f)
                    close()
                    moveTo(2f, 0f)
                    lineTo(3f, 0f)
                    lineTo(5f, 5f)
                    lineTo(4f, 5f)
                    lineTo(3f, 4f)
                    lineTo(2f, 4f)
                    lineTo(1f, 5f)
                    lineTo(0f, 5f)
                    lineTo(2f, 0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(1f, 4f)
                    curveTo(1.62f, 3.84f, 1.84f, 4.00f, 2.29f, 4.00f)
                    curveTo(2.81f, 4.00f, 3.00f, 3.59f, 3.00f, 3.30f)
                    lineTo(3f, 0f)
                    lineTo(4f, 0f)
                    lineTo(4f, 4f)
                    curveTo(4.00f, 4.32f, 3.33f, 5.00f, 2.45f, 5.00f)
                    curveTo(1.63f, 5.00f, 1.15f, 4.76f, 0.80f, 4.32f)
                    lineTo(1f, 4f)
                    close()
                }
            }
        }.build()

        return _Aspectj!!
    }

private var _Aspectj: ImageVector? = null

