package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RwAccess: ImageVector
    get() {
        if (_RwAccess != null) return _RwAccess!!

        _RwAccess = ImageVector.Builder(
            name = "RwAccess",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(8f, 11f)
                lineTo(11f, 9f)
                lineTo(8f, 6f)
                lineTo(8f, 8f)
                lineTo(3f, 8f)
                lineTo(3f, 9f)
                lineTo(8f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(2f, 5f)
                lineTo(5f, 8f)
                lineTo(5f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(10f, 3f)
                lineTo(14f, 7f)
                lineTo(10f, 12f)
                lineTo(10f, 12f)
                lineTo(11f, 12f)
                lineTo(15f, 7f)
                lineTo(11f, 3f)
                close()
            }
        }.build()

        return _RwAccess!!
    }

private var _RwAccess: ImageVector? = null

