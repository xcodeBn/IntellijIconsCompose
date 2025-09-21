package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Properties: ImageVector
    get() {
        if (_Properties != null) return _Properties!!

        _Properties = ImageVector.Builder(
            name = "Properties",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
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
                moveTo(7f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 8f)
                lineTo(13f, 8f)
                lineTo(13f, 6f)
                lineTo(13f, 1f)
                lineTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 15f)
                lineTo(7f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(14f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 7f)
                lineTo(14f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4AF3D))
            ) {
                moveTo(11f, 16f)
                lineTo(13f, 16f)
                lineTo(13f, 9f)
                lineTo(11f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(8f, 16f)
                lineTo(10f, 16f)
                lineTo(10f, 11f)
                lineTo(8f, 11f)
                close()
            }
        }.build()

        return _Properties!!
    }

private var _Properties: ImageVector? = null

