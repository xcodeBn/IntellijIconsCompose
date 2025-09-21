package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Projecttab: ImageVector
    get() {
        if (_Projecttab != null) return _Projecttab!!

        _Projecttab = ImageVector.Builder(
            name = "Projecttab",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(1f, 2f)
                lineTo(15f, 2f)
                lineTo(15f, 15f)
                lineTo(1f, 15f)
                lineTo(1f, 2f)
                close()
                moveTo(2f, 5f)
                lineTo(2f, 14f)
                lineTo(14f, 14f)
                lineTo(14f, 5f)
                lineTo(2f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(1f, 2f)
                    lineTo(15f, 2f)
                    lineTo(15f, 15f)
                    lineTo(1f, 15f)
                    lineTo(1f, 2f)
                    close()
                    moveTo(2f, 5f)
                    lineTo(2f, 14f)
                    lineTo(14f, 14f)
                    lineTo(14f, 5f)
                    lineTo(2f, 5f)
                    close()
                }
            }
        }.build()

        return _Projecttab!!
    }

private var _Projecttab: ImageVector? = null

