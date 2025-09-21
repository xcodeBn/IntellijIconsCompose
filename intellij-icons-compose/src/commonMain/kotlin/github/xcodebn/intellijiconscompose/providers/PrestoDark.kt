package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PrestoDark: ImageVector
    get() {
        if (_PrestoDark != null) return _PrestoDark!!

        _PrestoDark = ImageVector.Builder(
            name = "PrestoDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _PrestoDark!!
    }

private var _PrestoDark: ImageVector? = null

