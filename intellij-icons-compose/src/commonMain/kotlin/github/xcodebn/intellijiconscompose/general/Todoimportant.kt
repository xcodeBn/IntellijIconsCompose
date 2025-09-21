package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Todoimportant: ImageVector
    get() {
        if (_Todoimportant != null) return _Todoimportant!!

        _Todoimportant = ImageVector.Builder(
            name = "Todoimportant",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(12f, 16f)
                lineTo(12f, 14f)
                lineTo(14f, 14f)
                lineTo(14f, 16f)
                lineTo(12f, 16f)
                close()
                moveTo(12f, 7f)
                lineTo(14f, 7f)
                lineTo(14f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(14f, 5f)
                lineTo(9f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 8f)
                lineTo(9f, 8f)
                lineTo(9f, 9f)
                lineTo(5f, 9f)
                lineTo(5f, 10f)
                lineTo(9f, 10f)
                lineTo(9f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFF26522))
                ) {
                    moveTo(12f, 16f)
                    lineTo(12f, 14f)
                    lineTo(14f, 14f)
                    lineTo(14f, 16f)
                    lineTo(12f, 16f)
                    close()
                    moveTo(12f, 7f)
                    lineTo(14f, 7f)
                    lineTo(14f, 13f)
                    lineTo(12f, 13f)
                    lineTo(12f, 7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(14f, 5f)
                    lineTo(9f, 5f)
                    lineTo(5f, 5f)
                    lineTo(5f, 6f)
                    lineTo(9f, 6f)
                    lineTo(9f, 7f)
                    lineTo(5f, 7f)
                    lineTo(5f, 8f)
                    lineTo(9f, 8f)
                    lineTo(9f, 9f)
                    lineTo(5f, 9f)
                    lineTo(5f, 10f)
                    lineTo(9f, 10f)
                    lineTo(9f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 5f)
                    close()
                }
            }
        }.build()

        return _Todoimportant!!
    }

private var _Todoimportant: ImageVector? = null

